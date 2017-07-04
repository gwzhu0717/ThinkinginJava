package holding;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by Zhugw on 2017/6/22.
 */
public class ForEachCollection {
    public static void main(String[] args) {
        Collection<String> cs=new LinkedList<String>();
        Collections.addAll(cs,"Take the long way home".split(" "));
        for (String s:cs) {
            System.out.print("'"+s+"'");
        }
        System.out.println();
    }
}
