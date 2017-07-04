package initialization;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Zhugw on 2017/6/10.
 */
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand=new Random(47);
        a=new int[rand.nextInt(20)];
        System.out.println("length of a = "+a.length);
        System.out.println(Arrays.toString(a));
    }
}
