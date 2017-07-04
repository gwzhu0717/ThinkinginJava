package polymorphism;

/**
 * Created by Zhugw on 2017/6/13.
 */
class StaticSuper{
    public static String staticGet() {
        return "Base staticGet()";
    }
    public String dynamicGet() {
        return "Base dynamicGet()";
    }
}

class StaticSub extends StaticSuper{
    public static String staticGet() {
        return "Derived staticGet()";
    }
    public String dynamicGet() {
        return "Derived dynamicGet()";
    }
}
public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup=new StaticSub();
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }
}
