package 第十章;

/**
 * Created by lh on 17-7-12.
 * An anonymous inner class that performs
 * initialization.A briefer version of parcel5.java
 */
public class Parcel9 {
    // Argument must be final to use inside
    // anonymous inner class:
    private String a;

    // 如果内部类回调 readLable 中的dest 对象 ,在调用代码下 b 被复制为空，而内部内一般在别的线程中 调用不存在的地址
    // 该情况记录在gitbook 中
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;
            public String readLabel() {
                return label;
            }

        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        String b = "Tasmania";
        Destination d = p.destination(b);
        b = "2";
        d.readLabel();
    }
} ///:~

