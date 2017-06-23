package 第五章;

/**
 * Created by lh on 17-6-23.
 */
public class Burrito {
    Spiciness degree;

    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    public static void main(String[] args) {
        Burrito plain = new Burrito(Spiciness.NOT),
                greenChile = new Burrito(Spiciness.MEDIUM),
                jalaptno = new Burrito(Spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jalaptno.describe();

    }

    public void describe() {
        System.out.println("This burroite is ");
        switch (degree) {
            case NOT:
                System.out.println("not spicy at all.");
                break;
            case MILD:
                System.out.println("a little not.");
                break;
            case HOT:
            case FLAMING:
            default:
                System.out.println("maybe too hot.");
        }
    }
}
