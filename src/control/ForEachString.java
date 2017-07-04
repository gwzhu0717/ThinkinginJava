package control;

/**
 * Created by Zhugw on 2017/6/9.
 */
public class ForEachString {
    public static void main(String[] args) {
        for (char c:"An African Swallow".toCharArray()
             ) {
            System.out.print(c+" ");
        }
    }
}
