package control;

import static net.mindview.util.Range.range;

/**
 * Created by Zhugw on 2017/6/9.
 */
public class BreakAndContinues {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            if (i==74) break;
            if (i%9==0) continue;
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i:range(100)) {
            if (i==74) break;
            if (i%9==0) continue;
            System.out.print(i+" ");
        }
        System.out.println();
        int i=0;
        while (true){
            i++;
            int j=i*27;
            if (j==1269) break;
            if (j%10==0) continue;
            System.out.print(i+" ");
        }
    }
}
