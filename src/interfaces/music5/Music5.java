package interfaces.music5;

import polymorphism.music.Note;

/**
 * Created by Zhugw on 2017/6/13.
 */
interface Instrument{
    // Compile-time constant:
    int VALUE=5;// static & final
    // Cannot have method definitions:
    void play(Note n);// Automatically public
    void adjust();
}

class Wind implements Instrument{
    public void play(Note n){
        System.out.println(this+",play() "+n);
    }

    @Override
    public String toString() {
        return "Wind";
    }

    public  void adjust(){
        System.out.println(this+",adjust()");
    }

}

class Percussion implements Instrument{
    @Override
    public String toString() {
        return "Percussion";
    }

    @Override
    public void play(Note n) {
        System.out.println(this+",play() "+n);
    }

    @Override
    public void adjust() {
        System.out.println(this+",adjust()");
    }
}

class Stringed implements Instrument{
    @Override
    public String toString() {
        return "Stringed{}";
    }

    @Override
    public void play(Note n) {
        System.out.println(this+",play() "+n);
    }

    @Override
    public void adjust() {
        System.out.println(this+",adjust()");
    }
}

class Brass extends Wind{
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind{
    @Override
    public String toString() {
        return "Woodwind{}";
    }
}
public class Music5 {
    static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e){
        for (Instrument i:e) {
            i.play(Note.MIDDLE_C);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra={new Wind(),new Percussion(),
        new Stringed(),new Brass(),new Woodwind()};
        tuneAll(orchestra);
    }
}
/*
toString()方法是根类Object的一部分，因此不需要出现在接口中。
 */
