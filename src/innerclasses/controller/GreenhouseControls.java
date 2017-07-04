package innerclasses.controller;

/**
 * Created by Zhugw on 2017/6/17.
 */
public class GreenhouseControls extends Controller {
    private boolean light=false;
    public class LightOn extends Event{
        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light=true;
        }

        @Override
        public String toString() {
            return "Light is on";
        }
    }

    public class LightOff extends Event{
        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light=false;
        }

        @Override
        public String toString() {
            return "Light is off";
        }
    }

    private boolean water=false;
    public class WaterOn extends Event{
        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water=true;
        }

        @Override
        public String toString() {
            return "Water is on";
        }
    }

    public class WaterOff extends Event{
        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water=false;
        }

        @Override
        public String toString() {
            return "Water is off";
        }
    }

    private String thermostat="Day";
    public class ThermostatNight extends  Event{
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat="Night";
        }

        @Override
        public String toString() {
            return "Thermostat on night setting";
        }
    }

    public class ThermostatDay extends Event{
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat="Day";
        }

        @Override
        public String toString() {
            return "Thermostat on day setting";
        }
    }

    public class Bell extends Event{
        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell((delayTime)));
        }

        @Override
        public String toString() {
            return "Bing!";
        }
    }

    public class Restart extends Event{
        private Event[] eventList;

        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e:eventList) {
                addEvent(e);
            }
        }

        @Override
        public void action() {
            for (Event e:eventList) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        @Override
        public String toString() {
            return "Restarting System";
        }
    }

    public static class Terminate extends Event{
        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Terminating";
        }
    }
}

/*
注意：light、water和thermostat都属于外围类GreenhouseConrols，而这些内部类能够自由地访问那些字段，
无需限定条件或特殊许可。而且，action()方法通常涉及对某种硬件的控制。
大多数Event类看起来很相似，但是Bell和Restart则比较特别。Bell控制响铃，然后在事件列表中增加一个Bell对象，
于是过一会儿可以再次响铃。内部类可能像多重继承；Bell和Restart有Event的所有方法，并且似乎也拥有外围类GreenhouseControls
的所有方法。
一个由Event对象组成的数组被递交给Restart，该数组要加到控制器上。由于Restart()也是一个Event对象，所以同样可以将Restart对象
添加到Restart.action()中，以使系统能够有规律地重新启动自己。
 */