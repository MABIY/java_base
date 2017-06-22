package 第五章;

/**
 * Created by lh on 17-6-21.
 */
class Doc8 {
    Doc8(int i) {
        this("MD");
        int yearsTraining = i;
        System.out.println("New doc with" + i + "years of trainnig");
    }

    public Doc8(String md) {
        String degree = md;
        System.out.println("New dock with" + md + "degree" );
    }

    void intubate() {
        System.out.println("prepare patient");
        laryngoscopy();
    }

    private void laryngoscopy() {
        System.out.println("use laryngoscopy");
    }
}
public class OverLoadConstructors {
    public static void main(String[] args) {
        new Doc8(8).intubate();
    }
}
