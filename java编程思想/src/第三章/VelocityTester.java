package 第三章;

/**
 * Created by lh on 17-5-26.
 */
class VelocityCalculator {
    static float velocity(float d, float t) {
        if (t == 0f) {
            return 0f;
        } else {
            return d / t;
        }
    }
}
public class VelocityTester {
    public static void main(String[] args) {
        float d = 565.3f;
        float t = 0;
        System.out.println("Distance: " + d);
        System.out.println("Time: " + t);
        float v = VelocityCalculator.velocity(d,t);
        System.out.println("Velocity: " + v);
    }
}
