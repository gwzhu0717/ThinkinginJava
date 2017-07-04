package initialization;

import javax.sound.midi.Soundbank;

/**
 * Created by Zhugw on 2017/6/10.
 */
public class VarargType {
    static void  f(Character... args){
        System.out.print(args.getClass());
        System.out.println(args.length);
    }
    static void g(int... args){
        System.out.print(args.getClass());
        System.out.println(args.length);
    }

    public static void main(String[] args) {
        f('1');
        f();
        g(1);
        g();
        System.out.println("int[] "+new int[0].getClass());
    }
}
