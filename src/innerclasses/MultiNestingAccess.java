package innerclasses;

/**
 * Created by Zhugw on 2017/6/16.
 */
class MNA{
    private void f(){}
    class A{
        private void g(){}
        public class B{
            void h(){
                f();
                g();
            }
        }
    }
}

public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna=new MNA();
        MNA.A mnaa=mna.new A();
        MNA.A.B maaab=mnaa.new B();
        maaab.h();
    }
}

/*
可以看到在MNA.A.B中，调用方法g()和f()不需要任何条件(即使它们被定义为private)。这个例子
同时展示了如何从不同的类里创建多层嵌套的内部类对象的基本语法。“.new”语法能产生正确的作用域，
所以不必在调用构造器时限定类名。
 */