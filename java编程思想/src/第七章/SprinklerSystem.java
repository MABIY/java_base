package 第七章;

/**
 * Created by lh on 17-6-24.
 */
class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;

    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    public String toString() {
        return
                "valve1 = " + valve1 + " " +
                        "valve2 = " + valve2 + " " +
                        "valve1 = " + valve3 + " " +
                        "valve1 = " + valve4 + "\n " +
                        "i =  " + i + "  " + "f = " + f + " " +
                        "source = " + source;
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        System.out.println(sprinklerSystem);
    }
}
