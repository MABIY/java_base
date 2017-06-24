package 第七章;

/**
 * Created by lh on 17-6-24.
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipContols contols = new SpaceShipContols();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    //Delegatyed method;
    public void back(int velocity) {
        contols.back(velocity);
    }

    public void down(int velocity) {
        contols.down(velocity);
    }

    public void forward(int velocity) {
        contols.forward(velocity);
    }

    public void left(int velocity) {
        contols.left(velocity);
    }

    public void right(int velocity) {
        contols.right(velocity);
    }

    public void turboBoost() {
        contols.turboBoost();
    }

    public void up(int velocity) {
        contols.up(velocity);
    }

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("NSEA Protector");
        protector.forward(100);
    }

















}
