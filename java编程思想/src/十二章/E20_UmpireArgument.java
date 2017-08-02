package 十二章;

/**
 * Created by lh on 17-8-2.
 * Modify StormyInning.java by adding an
 * UmpireArgument exception type and methods
 * that throw this exception.Test the modified
 * hierarchy
 */
class UmpireArguemnt extends BaseballException {
}

abstract class Inning1 {
    Inning1() throws BaseballException {
    }

    void event() throws BaseballException {
    }

    abstract void atBat() throws Strike, Foul, UmpireArguemnt;

    abstract void decision() throws UmpireArguemnt;

    void walk() { //throws nothing

    }

}

class StormyInning1 extends Inning implements Storm {

    public StormyInning1() throws RainedOut, BaseballException {
    }

    public StormyInning1(String s) throws Foul, BaseballException {
    }


    @Override
    public void atbat() throws PopFoul, UmpireArguemnt {
        throw new UmpireArguemnt();
    }

    @Override
    public void rainHard() throws RainedOut {
    }

    public void event() {
    }

    void decision() throws UmpireArguemnt {
        throw new UmpireArguemnt();
    }
}

public class E20_UmpireArgument {
    public static void main(String[] args) {
        //Some code as before,still catches
        // the new exception:
        try {
            StormyInning1 si = new StormyInning1();
            si.atbat();
        } catch (PopFoul popFoul) {
            popFoul.printStackTrace();
        } catch (UmpireArguemnt umpireArguemnt) {
            umpireArguemnt.printStackTrace();
        } catch (BaseballException e) {
            e.printStackTrace();
        } catch (RainedOut rainedOut) {
            rainedOut.printStackTrace();
        }
        //Strike not thrown in derived version
        try {
            Inning i = new StormyInning1();
            i.atbat();
        } catch (Strike strike) {
            System.out.println("Strike");
        } catch (Foul foul) {
            System.out.println("Foul");
        }catch (RainedOut rainedOut) {
            System.out.println("Rained out");
        }catch (UmpireArguemnt umpireArguemnt) {
        } catch (BaseballException e) {
            System.out.println("Gerneric baseball exception");
        }
        //Or you can add code to catch the
        // specific type of exception
        try {
            StormyInning1 si = new StormyInning1();
            si.atbat();
            si.decision();
        } catch (BaseballException e) {
            e.printStackTrace();
        } catch (RainedOut rainedOut) {
            rainedOut.printStackTrace();
        }
    }


}
