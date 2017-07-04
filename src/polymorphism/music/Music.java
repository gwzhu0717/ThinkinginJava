package polymorphism.music;

/**
 * Created by Zhugw on 2017/6/13.
 */
public class Music {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute=new Wind();
        tune(flute);
    }
}
