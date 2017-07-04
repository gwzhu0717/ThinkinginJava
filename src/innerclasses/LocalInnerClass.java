package innerclasses;

/**
 * Created by Zhugw on 2017/6/17.
 */
interface Counter {
    int next();
}
public class LocalInnerClass {
    private int count = 0;
    Counter getCounter(final String name) {
        // A local inner class:
        class LocalCounter implements Counter {
            public LocalCounter() {
                // Local inner class can have a constructor
                System.out.println("LocalCounter()");
            }
            public int next() {
                System.out.print(name); // Access local final
                return count++; //访问外部类的成员
            }
        }
        return new LocalCounter();
    }
    // The same thing with an anonymous inner class:
    Counter getCounter2(final String name) {
        return new Counter() {
            // Anonymous inner class cannot have a named
            // constructor, only an instance initializer:
            {
                System.out.println("Counter()");
            }
            public int next() {
                System.out.print(name); // Access local final
                return count++;
            }
        };
    }
    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter
                c1 = lic.getCounter("Local inner "),
                c2 = lic.getCounter2("Anonymous inner ");
        for(int i = 0; i < 5; i++)
            System.out.println(c1.next());
        for(int i = 0; i < 5; i++)
            System.out.println(c2.next());
    }
}

/*
Counter返回的是序列中的下一个值。我们使用了局部内部类和匿名内部类实现了这个功能，
它们具有相同的行为和能力。既然局部内部类的名字在方法外是不可见的，我们需要局部内部类的原因是
我们需要一个已命名的构造器，或者需要重载构造器，而匿名内部类只能用于实例初始化。
 */