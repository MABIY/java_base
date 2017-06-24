package 第七章;

/**
 * Created by lh on 17-6-24.
 */
public class SpaceShip extends SpaceShipContols {
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NaEA Protertor");
        protector.forward(100);
    }
}
