package 第九章.filters;

/**
 * Created by lh on 17-7-3.
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}

