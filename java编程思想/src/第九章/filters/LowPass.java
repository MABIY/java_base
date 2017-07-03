package 第九章.filters;

/**
 * Created by lh on 17-7-3.
 */
public class LowPass extends Filter{
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    public Waveform process(Waveform input) {
        return input;//Dummy processing
    }
}
