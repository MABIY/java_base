package 第九章.filters;

/**
 * Created by lh on 17-7-3.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform " + id;
    }
}
