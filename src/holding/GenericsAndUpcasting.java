package holding;

import java.util.ArrayList;

/**
 * Created by Zhugw on 2017/6/21.
 */
class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Braeburn extends Apple{}

public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples=new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for (Apple e:apples) {
            System.out.println(e);
        }
    }
}
