package 第五章;

/**
 * Created by lh on 17-6-22.
 */
public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[]{"fiddle","de","dum"});
    }
}

class Other {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }
    }
}
