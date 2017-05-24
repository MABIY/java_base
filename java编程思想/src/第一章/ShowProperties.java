package 第一章;

/**
 * Created by lh on 17-5-24.
 */
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(
                System.getProperties()+"\n" +
                System.getProperty("java.library.path")
        );
    }
}
