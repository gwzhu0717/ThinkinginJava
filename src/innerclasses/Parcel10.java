package innerclasses;

/**
 * Created by Zhugw on 2017/6/16.
 */
public class Parcel10 {
    public Destination destination(final String dest,final float price){
        return new Destination() {
            private int cost;
            //为每个对象初始化
            {
                cost=Math.round(price);
                if (cost>100){
                    System.out.println("Over budget!");
                }
            }
            private String label=dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p=new Parcel10();
        Destination d=p.destination("Tasmania",101.395F);
    }
}

/*
在实例初始化操作的内部，可以看到有一段代码，它们不能作为字段初始化动作的一部分来执行。
所以对于匿名内部类而言，实例初始化的实际效果就是构造器。当然它受到了限制---你不能重载实例初始化方法，
所以你仅有一个这样的构造器。
 */