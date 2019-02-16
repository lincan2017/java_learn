package headfirst.pattern.command.demo.elecapp;

/**
 * @author : Lin Can
 * @date : 2019/2/16 20:14
 */
public class WaterHeater {
    private String location;

    public WaterHeater(String location) {
        this.location = location;
    }

    public String on() {
        return location + " water heater is on.";
    }

    public String off() {
        return location + " water heater is off.";
    }
}
