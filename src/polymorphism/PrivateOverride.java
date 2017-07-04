package polymorphism;

/**
 * Created by Zhugw on 2017/6/13.
 */

public class PrivateOverride {
    private void f() { System.out.println("private f()"); }
    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}

class Derived extends PrivateOverride {
    public void f() { System.out.println("public f()"); }
}

/*
1.我们期望输出的是public f()，但是由于private方法被自动认为是final方法，而且对导出类
是屏蔽的。因此，在这种情况下，Derived类中的f()方法就是一个全新的方法；既然基类中的f()方法
在子类Derived中不可见，因此甚至也不能被重载。
只有非private方法才可以被覆盖；但是还需要密切注意覆盖private方法的现象，这时虽然编译器不会报错，
但是也不会按照我们所期望的来执行。
 */
