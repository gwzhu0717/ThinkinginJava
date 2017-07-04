package interfaces.filters;

/**
 * Created by Zhugw on 2017/6/14.
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input){
        return input;
    }
}
