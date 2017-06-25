package 第七章;

/**
 * Created by lh on 17-6-25.
 */
class Instrument {
    public void paly() {

    }

    static void tune(Instrument instrument) {
        //...
        instrument.paly();
    }
}

// Wind objects are instruments
public class Wind extends Instrument {
    public Wind() {
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute); //Upcasting
    }
}
