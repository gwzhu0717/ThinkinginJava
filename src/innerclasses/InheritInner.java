package innerclasses;

/**
 * Created by Zhugw on 2017/6/17.
 */
class WithInner{
    class Inner{}
}
public class InheritInner extends WithInner.Inner {
    InheritInner(WithInner wi){
        wi.super();
    }
    /*
    当要生成一个构造器时，默认的构造器并不算好，而且不能只是传递一个指向外围类对象的引用。此外，
    必须在构造器内使用如下语法：
    enclosingClassReference.super()
    这样才提供了必要的引用，然后程序才能编译通过。
     */
    public static void main(String[] args) {
        WithInner wi=new WithInner();
        InheritInner ii=new InheritInner(wi);
    }
}
