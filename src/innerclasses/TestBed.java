package innerclasses;

/**
 * Created by Zhugw on 2017/6/16.
 */
public class TestBed {
    public void f(){
        System.out.println("f()");
    }

    public static class Tester{
        public static void main(String[] args) {
            TestBed t=new TestBed();
            t.f();
        }
    }
}
