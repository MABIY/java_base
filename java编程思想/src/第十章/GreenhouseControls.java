package 第十章;

/**
 * Created by lh on 17-7-18.
 * This produces a specific application of the
 * control system. all in a single class. Inner
 * classes allow you to encapsulatedifferent
 * functionality for each type of event
 */
public class GreenhouseControls extends Controller {
    private boolean light = false;

    public class LightOn extends Event {
        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // Put hardware control code here to
            // physically turn on
            light = true;
        }

        @Override
        public String toString() {
            return "Light is on";
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
            // PUt hardware control code here to
            // physically turn off the light
            light = false;
        }
    }

    private boolean water = false;

    public class WaterOn extends Event {
        @Override
        // Put hardware control code here.
        public void action() {
            water = true;
        }

        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public String toString() {
            return "Greenhouse water is on";
        }
    }

    public class WaterOff extends Event {
        @Override
        public void action() {
            //Put hardware control code here.
            water = false;
        }

        @Override
        public String toString() {
            return "Greenhouse water is off";
        }

        public WaterOff(long delayTime) {
            super(delayTime);
        }
    }

    private String thermostat = "Day";

    public class ThermostatNight extends Event {
        @Override
        public void action() {
            // put hardware control code here
            thermostat = "Night";
        }

        @Override
        public String toString() {
            return "Thermostat on night setting";
        }

        public ThermostatNight(long delayTime) {
            super(delayTime);
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
            // Put hardware control code here.
            thermostat = "Day";
        }
    }

    // An example of an action() that inserts a
    // new one of itself into the event list:
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
        @Override
        public void action() {
            for (Event e : eventList) {
                e.start(); //Return each event
            }
        }

        private Event[] eventList;
        public Restart(long delayTime,Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList) {
                addEvent(e);
            }
        }

        @Override
        public String toString() {
            return "Restarting system";
        }
    }

    public static class Terminate extends Event {
        public Terminate(long delayTime) {
            super(delayTime);
        }


        @Override
        public String toString() {
            return "Terminating";
        }

        @Override
        public void action() {
            System.exit(0);
        }
    }

}
