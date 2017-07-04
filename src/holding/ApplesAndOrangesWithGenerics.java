package holding;

import java.util.ArrayList;

/**
 * Created by Zhugw on 2017/6/21.
 */
public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples=new ArrayList<Apple>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        for (int i = 0; i <apples.size() ; i++) {
            System.out.println(apples.get(i).id());
        }
        for (Apple e:apples) {
            System.out.println(e.id());
        }
    }
}
