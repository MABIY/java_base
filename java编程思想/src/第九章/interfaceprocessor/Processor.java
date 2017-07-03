package 第九章.interfaceprocessor;

/**
 * Created by lh on 17-7-3.
 */
public interface Processor {
    String name();

    Object process(Object input);
}
