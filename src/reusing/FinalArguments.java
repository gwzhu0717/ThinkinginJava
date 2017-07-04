package reusing;

/**
 * Created by Zhugw on 2017/6/13.
 */
class Gizmo{
    public void spin(){}
}

public class FinalArguments {
    void with(final Gizmo g){
        //! g = new Gizmo(); // Illegal -- g is final
    }

    void without(Gizmo g){
        g=new Gizmo();
        g.spin();
    }
    // void f(final int i) { i++; } // Can't change
    // You can only read from a final primitive:
    int g(final int i) { return i + 1; }
    //方法f()和g()展示了当基本类型的参数被指明为final时所出现的结果：你可以读参数，
    //但却无法修改参数
    public static void main(String[] args) {
        FinalArguments bf=new FinalArguments();
        bf.with(null);
        bf.without(null);
    }
}
