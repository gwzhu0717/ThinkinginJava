package innerclasses;

/**
 * Created by Zhugw on 2017/6/16.
 */
public class Parcel9 {
    public Destination destination(final String dest){
        return new Destination() {
            private String label=dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p=new Parcel9();
        Destination d=p.destination("Tasmania");
    }
}

/*
如果定义一个匿名内部类，并且希望它使用一个在其外部定义的对象，那么编译器会要求其参数
引用是final的，就像你在destination()的参数中看到的那样。如果你忘记了，将会得到一个编译
时错误消息。
 */