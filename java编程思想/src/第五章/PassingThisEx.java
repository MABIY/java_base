package 第五章;

/**
 * Created by lh on 17-6-21.
 */
class Doc {
    void intubate() {
        System.out.println("prepare patient");
        laryngoscopy();
        this.laryngoscopy();
    }

    private void laryngoscopy() {
        System.out.println("use laryngoscope");
    }
}
public class PassingThisEx {
    public static void main(String[] args) {
        new Doc().intubate();
    }
}
