package initialization;

/**
 * Created by Zhugw on 2017/6/9.
 */
public class Flower {
    int petalCount=0;
    String s="initial value";

    public Flower(int petalCount) {
        this.petalCount = petalCount;
        System.out.println("Constructor w/ int arg only,petalCount= "+petalCount);
    }

    public Flower(String s) {
        this.s = s;
        System.out.println("Constructor w/ String arg only,s= "+s);
    }

    public Flower(int petalCount, String s) {
        this(petalCount);
        this.s = s;
        System.out.println("String && petalCount");
    }

    public Flower() {
        this(47,"hi");
        System.out.println("default constructor(no args)");
    }
    void printPetalCount(){
        System.out.println("petalCount= "+petalCount+",s="+s);
    }

    public static void main(String[] args) {
        Flower f=new Flower();
        f.printPetalCount();
    }
}
