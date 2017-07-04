package initialization;

/**
 * Created by Zhugw on 2017/6/9.
 */
class  Book{
    boolean checkOut=false;

    public Book(boolean checkOut) {
        this.checkOut = checkOut;
    }
    void checkIn()
    {
        this.checkOut=false;
    }

    @Override
    protected void finalize() throws Throwable {
        if (checkOut){
            System.out.println("Error:checked out");
        }
    }
}
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel=new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }
}
