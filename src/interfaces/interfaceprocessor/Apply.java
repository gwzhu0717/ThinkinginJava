package interfaces.interfaceprocessor;

/**
 * Created by Zhugw on 2017/6/14.
 */
public class Apply {
    public static void process(Processor p,Object s){
        System.out.println("Using processor "+p.name());
        System.out.println(p.process(s));
    }
}
