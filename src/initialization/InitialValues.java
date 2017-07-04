package initialization;

/**
 * Created by Zhugw on 2017/6/9.
 */
public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;
    void printInitialValues(){
        System.out.println("Data label    Initial value");
        System.out.println("t = " + t);
        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("reference = " + reference);
    }

    public static void main(String[] args) {
        InitialValues iv=new InitialValues();
        iv.printInitialValues();
    }
}
