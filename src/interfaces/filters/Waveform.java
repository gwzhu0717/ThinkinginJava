package interfaces.filters;

/**
 * Created by Zhugw on 2017/6/14.
 */
public class Waveform {
    private static long counter;
    private final long id=counter++;

    @Override
    public String toString() {
        return "Waveform" + id;
    }
}
