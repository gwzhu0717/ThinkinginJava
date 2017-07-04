package operators;

/**
 * Created by Zhugw on 2017/6/8.
 */
public class Precedence {
    public static void main(String[] args) {
            int x=1,y=2,z=3;
            int a=x+y-2/2+z;
            int b=x+(y-2)/(2+z);
        System.out.println("a="+a+" b="+b);
    }
}
