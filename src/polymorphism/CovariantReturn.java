package polymorphism;

/**
 * Created by Zhugw on 2017/6/13.
 */
class Grain{
    public String toString(){
        return "Grain";
    }
}
class Wheat extends Grain{
    public String toString() {
        return "Wheat";
    }
}

class Mill{
    Grain process(){
        return new Grain();
    }
}

class WheatMill extends Mill{
    Wheat process(){
        return new Wheat();
    }
}
public class CovariantReturn {
    public static void main(String[] args) {
        Mill m=new Mill();
        Grain g=m.process();
        System.out.println(g);
        WheatMill w=new WheatMill();
        Wheat q=w.process();
        System.out.println(q);
    }
}

/*
Java SE5与Java较早版本之间的主要差异就是较早的版本将强制process()的覆盖版本必须返回
Grain，而不能返回Wheat，尽管Wheat是从Grain导出的，因而也应该是一种合法的返回类型。协变返回
类型允许返回更具体的Wheat类型。
 */