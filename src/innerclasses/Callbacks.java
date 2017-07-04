package innerclasses;

/**
 * Created by Zhugw on 2017/6/16.
 */
interface Incrementable{
    void increment();
}

class Callee1 implements Incrementable{
    private int i=0;

    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}

class MyIncrement{
    public void increment(){
        System.out.println("Other operation");
    }

    static void f(MyIncrement mi){
        mi.increment();
    }
}

class Callee2 extends MyIncrement{
    private int i=0;

    @Override
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }

    private class Closure implements Incrementable{
        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }

    Incrementable getCallbackReference(){
        return new Closure();
    }
}

class Caller{
    private Incrementable callbackReference;

    public Caller(Incrementable callbackReference) {
        this.callbackReference = callbackReference;
    }

    void go(){
        callbackReference.increment();
    }
}
public class Callbacks {
    public static void main(String[] args) {
        Callee1 c1=new Callee1();
        Callee2 c2=new Callee2();
        MyIncrement.f(c2);
        Caller caller1=new Caller(c1);
        Caller caller2=new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
    }
}


/*
外围类实现一个接口与内部类实现此接口之间的区别。就代码而言，Callee1是简单的解决方式。
Callee2继承自MyIncrement，后者已经有了一个不同的increment()方法，并且与Incrementable
接口期望的increment()方法完全不相关。所以如果Callee2继承了MyIncrement，就不能为了
Incrementable的用途而覆盖increment()方法，于是只能使用内部类独立实现Incrementable。
还要注意，当创建了一个内部类时，并没有在外围类的接口中添加东西，也没有修改外围类的接口。
 */