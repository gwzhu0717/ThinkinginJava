package operators;

/**
 * Created by Zhugw on 2017/6/8.
 */
public class StringOperators {
    public static void main(String[] args) {
        int x=0,y=1,z=2;
        String s="x,y,z";
        System.out.println(s+x+y+z);
        System.out.println(x+" "+s);
        s+="(summed)=";
        System.out.println(s+(x+y+z));
        System.out.println(""+x);
    }
}
