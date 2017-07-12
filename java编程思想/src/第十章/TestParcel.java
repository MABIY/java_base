package 第十章;

/**
 * Created by lh on 17-7-12.
 */
class Parcel4 {
    private class PContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
           return  i;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        private PDestination(String whereTo) {
            label = whereTo;
        }
        @Override
        public String readLabel() {
            return label;
        }
    }

}
public class TestParcel {
}
