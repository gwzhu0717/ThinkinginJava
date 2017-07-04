package initialization;

/**
 * Created by Zhugw on 2017/6/10.
 */
public class OptionalTrailingArguments {
    static void f(int require,String... trailing){
        System.out.println("required: "+require+" ");
        for (String s:trailing) {
            System.out.print(s+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(1,"one");
        f(2,"two","three");
        f(0);
    }
}
