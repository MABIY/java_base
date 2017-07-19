package 第十章;

/**
 * Created by lh on 17-7-19.
 * Inherit from GreenhouseControls in
 * GreenhouseControls.java to Event inner
 * classes that turn water mist generators on
 * and off. Write a new version of GreenhouseController.java
 * to use these new Event objects
 */
class GreenhouseControlsWrithWMS extends GreenhouseControlsWithFan {
    private boolean generator = false;

    public class WatermistGeneratorOn extends Event {
        @Override
        public String toString() {
            return "Water mist generatro is on";
        }

        public WatermistGeneratorOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            generator = false;
        }
    }

    public class WatermistGerneratorOff extends Event {
        @Override
        public String toString() {
            return "Water mist generator is off";
        }

        public WatermistGerneratorOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            generator = false;
        }
    }

}
public class E25_GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControlsWrithWMS gc = new GreenhouseControlsWrithWMS();
        //Instead of hard-wiring, you could parse
        // configuration information from a text file here:
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(500),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400),
                gc.new WatermistGeneratorOn(1600),
                gc.new WatermistGerneratorOff(1800),
        };
        gc.addEvent(gc.new Restart(2000,eventList));
        if (args.length == 1) {
            gc.addEvent(new GreenhouseControlsWrithWMS.Terminate(new Integer(args[0])));
        }
        gc.run();
    }
}
