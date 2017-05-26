package 第二章;

/**
 * Created by lh on 17-5-16.
 */
public class Light {
    public  String a="1";
    public void on() {
        System.out.println("on");
    }

    public void off() {
        System.out.println("off");
    }



    public Light(String a) {
        this.a =a;
    }

    public Light() {
    }

    public void change(String a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Light light = new Light();
        light.on();
        light.off();
    }
}
