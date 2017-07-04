package initialization;

/**
 * Created by Zhugw on 2017/6/10.
 */
public class Spoon {
    static int i;
    static {
        i = 47;
    }
    /**
    尽管上面的代码看起来像个方法，但它实际只是一段跟在static关键字后面的代码。与其他静态初始化
     动作一样，这段代码仅执行一次：当首次生成这个类的一个对象或者首次访问属于那个类的静态数据成员
     */
}
