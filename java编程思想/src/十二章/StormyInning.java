package 十二章;

import com.sun.javafx.geom.BaseBounds;

/**
 * Created by lh on 17-8-2.
 * Overridden methods may thrown only the exceptions
 * specified in their base-class versions,or exceptions
 * derived from the base-class exceptions
 */
class BaseballException extends Exception {
}

class Foul extends BaseballException {

}

class Strike extends BaseballException {

}

abstract class Inning {
    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException {
        //Doestn't actually have to throws anything
    }

    public abstract void atbat() throws Strike, Foul, UmpireArguemnt;

    public void walk() { //Throws no checked exceptions
    }

}

class StromException extends Exception {
}

class RainedOut extends StromException {
}

class PopFoul extends Foul {
}

interface Storm {
    void event() throws RainedOut;

    void rainHard() throws RainedOut;
}


public class StormyInning extends Inning implements Storm {
    public StormyInning() throws RainedOut, BaseballException {
    }

    public StormyInning(String s) throws Foul, BaseballException {
    }

    //Regular methods must conform to base class;
//    public void walk() throws PopFoul {
//     }
    //Interface CANNOT add exceptions to existing
    //methods from the base class:
//    public void event() throws RainedOut{
//    }

    //Overidden methods can thrown inherited exceptions:
    @Override
    public void atbat() throws PopFoul {

    }

    //If the method doesn't already exist in the
    //base class. the exception is ok
    @Override
    public void rainHard() throws RainedOut {

    }

    //You can choose to not throw any exceptions,
    //even if the base version does:
    public void event() {
    }

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atbat();
        } catch (PopFoul a) {
            System.out.println("Pop foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }

        //Strike not thrown in derived verison
        try {
            //What happens if you upcast?
            Inning i = new StormyInning();
            i.atbat();
        }catch (Strike strike) {
            strike.printStackTrace();
        } catch (Foul foul) {
            foul.printStackTrace();
        } catch (BaseballException e) {
            e.printStackTrace();
        } catch (RainedOut rainedOut) {
            rainedOut.printStackTrace();
        }
    }

}
