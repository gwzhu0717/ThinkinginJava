package interfaces.classprocessor;

import java.util.Arrays;

/**
 * Created by Zhugw on 2017/6/14.
 */
class Processor{
    public String name(){
        return getClass().getName();
    }

    Object process(Object input){
        return input;
    }
}

class Upcase extends Processor{
    String process(Object input){
        return ((String)input).toUpperCase();
    }
}

class Downcase extends Processor{
    String process(Object input){
        return ((String)input).toUpperCase();
    }
}

class Splitter extends Processor{
    String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}


public class Apply {
    public static void process(Processor p,Object s){
        System.out.println("Using Processor "+p.name());
        System.out.println(p.process(s));
    }

    public static String s="Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(),s);
        process(new Downcase(),s);
        process(new Splitter(),s);
    }
}

/*
能够根据所传递参数对象的不同而具有不同行为的方法，称为策略设计模式。这类方法包含所要执行的算法
中固定不变的部分，而“策略”包含变化的部分。策略就是传递进去的参数对象，它包含要执行的代码。
 */