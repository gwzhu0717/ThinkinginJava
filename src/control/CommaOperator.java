package control;

/**
 * Created by Zhugw on 2017/6/8.
 */
public class CommaOperator {
    public static void main(String[] args) {
        for (int i = 0,j=i+10; i <5 ; i++,j=i*2) {
            System.out.println("i= "+i+",j= "+j);
        }
    }
}
