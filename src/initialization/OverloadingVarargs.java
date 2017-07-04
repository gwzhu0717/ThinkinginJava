package initialization;

/**
 * Created by Zhugw on 2017/6/10.
 */
public class OverloadingVarargs {
    static void f(Character... args) {
        System.out.print("first");
        for(Character c : args)
            System.out.print(" " + c);
        System.out.println();
    }
    static void f(Integer... args) {
        System.out.print("second");
        for(Integer i : args)
            System.out.print(" " + i);
        System.out.println();
    }
    static void f(Long... args) {
        System.out.println("third");
    }

    public static void main(String[] args) {
        f('a','b','c');
        f(1);
        f(2,1);
        f(0);
        f(0L);
    }
    /*
    在可变列表参数下，重载过程变得复杂。
    如上所示：
    在每一种情况中，编译器都会使用自动包装机制来匹配重载的方法，然后调用最明确匹配的方法
     */
}
