package access;

/**
 * Created by Zhugw on 2017/6/11.
 */
class Soup1{
    private Soup1(){
    }
    public static Soup1 makeSoup(){
        return new Soup1();
    }
}
class Soup2{
    private Soup2(){}
    private static Soup2 sp2=new Soup2();
    public static Soup2 makeSoup(){
        return sp2;
    }
    public void f(){

    }
}
public class Lunch{
    void testPrivate(){}
    void testStatic(){
       Soup1 sp1= Soup1.makeSoup();
    }
    void testSingleton() {
       Soup2.makeSoup().f();
    }
}
