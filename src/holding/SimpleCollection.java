package holding;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Zhugw on 2017/6/21.
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c=new ArrayList<Integer>();
        for (int i = 0; i <10 ; i++) {
            c.add(i);
        }
        for (Integer i:c) {
            System.out.println("i= "+i);
        }
    }
}
