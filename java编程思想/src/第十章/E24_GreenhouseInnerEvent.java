package 第十章;

import javafx.event.EventType;

/**
 * Created by lh on 17-7-19.
 * Add Event inner classes that turn fans on and
 * off in GreenhouseControls.java configure
 * GreenhouseController.java to use these new Event objects
 */
class GreenhouseControlsWithFan extends Controller {
   private boolean light = false;

    public class LightOn extends Event {
        @Override
        public String toString() {
            return "Light is on";
        }

        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
           // put hardware control code here to
            //physically turn on the light.
            light = true;
        }
    }

    public class LightOff extends Event {
        @Override
        public String toString() {
            return "Light is off";
        }

        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // put hardware control code here to
            // physically turn off the light.
            light = false;
        }
    }

    private boolean fan = false;

    public class FanOn extends Event {
        @Override
        public String toString() {
            return "Fan is on";
        }

        public FanOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            fan = true;
        }
    }

    public class FanOff extends Event {
        @Override
        public String toString() {
            return "Fan is off";
        }

        public FanOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // put hardware control code here to
            //physically turn off the fan.
            fan = false;
        }
    }
    private boolean water = false;

    public class WaterOn extends Event {
        @Override
        public String toString() {
            return "Greenhouse water is on";
        }

        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // Put hardware control code here
            water = true;
        }
    }

    public class WaterOff extends Event {
        @Override
        public String toString() {
            return "Greenhouse water is off";
        }

        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = false;
        }
    }

    private String thermostat = "Day";

    public class ThermostatNight extends Event {
        @Override
        public String toString() {
            return "Thermostat on night setting";
        }

        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Night";
        }
    }

    public class ThermostatDay extends Event {
        @Override
        public String toString() {
            return "Thermostat on day setting";
        }

        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Day";

        }
    }

    //An example of an action() that insert a
    // new one of itself into the event list;
    public class Bell extends Event {
        @Override
        public String toString() {
            return "Bing!";
        }

        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }
    }

    public class Restart extends Event {
        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList) {
                addEvent(e);
            }
        }

        private Event[] eventList;
        @Override
        public void action() {
            for (Event e : eventList) {
                e.start(); // return each event
                addEvent(e);
            }
            start(); // return this Event
            addEvent(this
            );

        }
    }

    public static class Terminate extends Event {
        @Override
        public String toString() {
            return "Terminate{}";
        }

        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }
    }


}

public class E24_GreenhouseInnerEvent {
    public static void main(String[] args) {
        GreenhouseControlsWithFan gc = new GreenhouseControlsWithFan();
        // Instead of hard-wiring,you could parse
        // configure information from a text file here;
        gc.addEvent(gc.new Bell(900));
        Event[] eventList= {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new FanOn(300),
                gc.new LightOff(400),
                gc.new FanOff(500),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400),
        };
        gc.addEvent(gc.new Restart(2000,eventList));
        if (args.length == 1) {
            gc.addEvent(new GreenhouseControlsWithFan.Terminate(new Integer(args[0])));
        }
        gc.run();
    }
}
