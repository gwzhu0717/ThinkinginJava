package polymorphism.music;

/**
 * Created by Zhugw on 2017/6/13.
 */
public class Wind extends Instrument {
    public void play(Note n){
        System.out.println("Wind.play() "+n);
    }
}
