package 十一章;

import 知识点.stand_Input_output.Echo;
import 第十章.Event;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lh on 17-7-27.
 * In the innerclasses/GreenhouseController.java
 * example, the class Controller uses an ArrayList.
 * Change the code to use a LinkedList instead,and
 * use an Iterator to cyscle through  the set of events.
 */
class Controller {
    // List changed to a LinkedList:
    private List<Event> eventList =
            new LinkedList<>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        while (eventList.size() > 0) {
            Iterator<Event> it = new LinkedList<Event>(eventList).iterator();
            while (it.hasNext()) {
                Event e = it.next();
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    it.remove();
                }
            }
        }
    }
}

class GreenhouseControls extends Controller {
    private boolean light = false;

    public class LightOn extends Event {
        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }
    }

    @Override
    public String toString() {
        return "Light is  on";
    }

    public class LightOff extends Event {
        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
           light =false;
        }

        @Override
        public String toString() {
            return "Light is off";
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
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }


        @Override
        public void action() {
            thermostat = "Night";
        }

        @Override
        public String toString() {
            return "Thermostat on night setting";
        }
    }

    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Day";
        }

        @Override
        public String toString() {
            return "Thermostat on day setting";
        }
    }

    public class Bell extends Event {
        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        @Override
        public String toString() {
            return "Bing!";
        }
    }

    public class Restart extends Event {
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

        @Override
        public void action() {
            for (Event e : eventList) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
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
public class E13_GreenhouseLinkedList {
    public static void main(String[] args) {
       GreenhouseControls gc = new GreenhouseControls();
       gc.addEvent(gc.new Bell(900));
       Event[] eventList = {
               gc.new ThermostatDay(0),
               gc.new LightOn(200),
               gc.new LightOff(400),
               gc.new WaterOn(600),
               gc.new WaterOff(800),
               gc.new ThermostatDay(1400),
       };
       gc.addEvent(gc.new Restart(2000,eventList));
        if (args.length == 1) {
            gc.addEvent(new GreenhouseControls.Terminate(
                    new Integer(args[0])
            ));
            gc.run();
        }
    }
}
