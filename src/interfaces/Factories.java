package interfaces;

/**
 * Created by Zhugw on 2017/6/14.
 */
interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}

class Implementation1 implements Service{
    public Implementation1() {
    }

    @Override
    public void method1() {
        System.out.println("Implementation1 method");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2 method");
    }
}

class Implementation1Factory implements ServiceFactory{
    public Implementation1Factory() {
    }

    @Override
    public Service getService() {
        return new Implementation1();
    }
}

class Implementation2 implements Service{
    public Implementation2() {
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}

class Implementation2Factory implements ServiceFactory{
    public Implementation2Factory() {
    }

    @Override
    public Service getService() {
        return new Implementation2();
    }
}

public class Factories{
    public static void serviceConsumer(ServiceFactory fact){
        Service s=fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implementation1Factory());
        serviceConsumer(new Implementation2Factory());
    }
}


