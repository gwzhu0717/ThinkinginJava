package initialization;

/**
 * Created by Zhugw on 2017/6/10.
 * 在House类中故意把几个方法散落在各处
 */
class Window {
    Window(int marker) { System.out.println("Window(" + marker + ")"); }
}
class House{
    Window w1 = new Window(1);

    public House() {
        System.out.println("House()");
        w3=new Window(33);
    }
    Window w2=new Window(2);
    void f(){
        System.out.println("f()");
    }

    Window w3=new Window(3);
}
public class OrderIfInitialization {
    public static void main(String[] args) {
        House h=new House();
        h.f();
    }
}
