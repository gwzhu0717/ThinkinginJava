package innerclasses;

/**
 * Created by Zhugw on 2017/6/16.
 */
interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}

class Implementation1 implements Service{
    private Implementation1(){}

    @Override
    public void method1() {
        System.out.println("Implementation1 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation1 method2");
    }

    public static ServiceFactory factory=new ServiceFactory(){
        @Override
        public Service getService() {
            return new Implementation1();
        }
    };
}

class Implementation2 implements Service{
    private Implementation2(){}

    @Override
    public void method1() {
        System.out.println("Implementation2 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2 method2");
    }

    public static ServiceFactory factory=new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation2();
        }
    };
}
public class Factories {
    public static void serviceConsumer(ServiceFactory fact){
        Service s=fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }
}

/*
现在用于Implementation1和Implementation2的构造器都可以是private的，并且没有任何必要去创建
作为工厂的具名类。另外，你经常只需要单一的工厂对象，因此在本例中它被创建为Service实现中的一个static域。
 */