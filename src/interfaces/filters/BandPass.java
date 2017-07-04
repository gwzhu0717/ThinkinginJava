package interfaces.filters;

/**
 * Created by Zhugw on 2017/6/14.
 */
public class BandPass extends Filter{
    double cutoff;

    public BandPass(double cutoff) {
        this.cutoff = cutoff;
    }

    public Waveform process(Waveform input){
        return  input;
    }
}
