package reusing;

/**
 * Created by Zhugw on 2017/6/11.
 */
class Art{
    public Art() {
        System.out.println("Art constructor");
    }
}
class Drawing extends Art{
    public Drawing() {
        System.out.println("Drawing constructor");
    }
}
public class Carton extends  Drawing{
    public Carton() {
        System.out.println("Carton constructor");
    }

    public static void main(String[] args) {
        Carton x=new Carton();
    }
}
