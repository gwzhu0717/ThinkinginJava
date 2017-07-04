package control;

/**
 * Created by Zhugw on 2017/6/8.
 */
public class WhileTest {
    static boolean condition(){
        boolean result=Math.random()<99;
        System.out.println("result: "+result);
        return result;
    }

    public static void main(String[] args) {
        while (condition())
            System.out.println("Inside 'while'");
        System.out.println("Exit While");
    }
}
