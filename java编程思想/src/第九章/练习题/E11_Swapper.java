package 第九章.练习题;

import net.mindview.util.CountingGenerator;
import 第九章.interfaceprocessor.Apply;
import 第九章.interfaceprocessor.Processor;

/**
 * Created by lh on 17-7-3.
 * Create a class with a method  that takes a String
 * argument and produces a result that swaps
 */
class CharacterPairSwapper {
    static String swap(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length() - 1; i += 2) {
            char c1 = sb.charAt(i);
            char c2 = sb.charAt(i + 1);
            sb.setCharAt(i, c2);
            sb.setCharAt(i+1,c1);
        }
        return sb.toString();
    }
}

class SwapperAdapter implements Processor {
    @Override
    public String name() {
        return CharacterPairSwapper.class.getSimpleName();
    }

    @Override
    public Object process(Object input) {
        return CharacterPairSwapper.swap((String)input);
    }
}
public class E11_Swapper {
    public static void main(String[] args) {
        Apply.process(new SwapperAdapter(),"123456");
        Apply.process(new SwapperAdapter(),"abcde");
    }
}
