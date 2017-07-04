package interfaces.filters;

/**
 * Created by Zhugw on 2017/6/14.
 */
public class HighPass extends Filter {
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    public Waveform process(Waveform input){
        return input;
    }
}
