package headfirst.pattern.command.demo.elecapp;

/**
 * @author : Lin Can
 * @date : 2019/2/11 23:22
 */
public class Light {
    private String location;

    public Light(String location) {
        this.location = location;
    }

    public String on() {
        return location + " light is on.";
    }

    public String off() {
        return location + " light is off.";
    }
}
