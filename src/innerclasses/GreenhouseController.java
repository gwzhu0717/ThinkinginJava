package innerclasses;

import innerclasses.controller.Event;
import innerclasses.controller.GreenhouseControls;

/**
 * Created by Zhugw on 2017/6/17.
 */
public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc=new GreenhouseControls();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList={
          gc.new ThermostatNight(0),
          gc.new LightOn(200),
          gc.new LightOff(400),
          gc.new WaterOn(600),
          gc.new WaterOff(800),
          gc.new ThermostatDay(1400),
        };
        gc.addEvent(gc.new Restart(200,eventList));
        if (args.length==1){
            gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
        }
    }
}
