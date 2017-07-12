package 第十章;

/**
 * Created by lh on 17-7-12.
 * Expanded version of Parcel7.java
 */
public class Parcel7b {
    class MyContents implements Contents {
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }

    public Contents contents() {
        return new MyContents();
    }

    public static void main(String[] args) {
        Parcel7b p = new Parcel7b();
        Contents c = p.contents();
    }
}
