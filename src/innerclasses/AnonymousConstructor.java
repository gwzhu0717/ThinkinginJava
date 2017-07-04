package innerclasses;

/**
 * Created by Zhugw on 2017/6/16.
 */
abstract class Base{
    public Base(int i){
        System.out.println("Base constructor,i= "+i);
    }

    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i){
        return new Base(i) {
            {
                System.out.println("Inside instance initializer");
            }
            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base=getBase(47);
        base.f();
    }
}

/*
在此例中，不要求变量i一定是final的。因为i被传递给匿名类的基类的构造器，
它并不会在匿名内部被直接使用。
 */