package innerclasses;

/**
 * Created by Zhugw on 2017/6/16.
 */
public class Parcel7 {
    public Contents contents(){
        return new Contents() {
            private int i=11;
            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p=new Parcel7();
        Contents c=p.contents();
    }
}

/*
contents()方法将返回值的生成与表示这个返回值的类的定义结合在一起！另外，这个类是匿名的，
它没有名字。更糟的是，看起来似乎是你正要创建一个Contents对象。但是然后（在分号到达语句结束的分号之前）
你却说：“等一等，我想在这里插入一个类的定义。”
 */
