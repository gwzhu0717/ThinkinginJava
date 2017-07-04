package initialization;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Zhugw on 2017/6/10.
 */
public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand=new Random(47);
        Integer[] a=new Integer[rand.nextInt(20)];
        System.out.println("length of a= "+a.length);
        for (int i = 0; i <a.length ; i++) {
            a[i]=rand.nextInt(500);
        }
        System.out.println(Arrays.toString(a));
    }
}
