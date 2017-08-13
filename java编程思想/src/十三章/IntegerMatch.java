package 十三章;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by lh on 17-8-7.
 */
public class IntegerMatch {
    public static void main(String[] args) {
        System.out.println("-12345".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+911".matches("-?\\d+"));
        System.out.println("+911".matches("(-|\\+)?\\d+"));
    }
}
