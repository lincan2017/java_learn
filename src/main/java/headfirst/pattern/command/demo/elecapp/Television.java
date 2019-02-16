package headfirst.pattern.command.demo.elecapp;

/**
 * @author : Lin Can
 * @date : 2019/2/16 20:12
 */
public class Television {
    private String location;

    public Television(String location) {
        this.location = location;
    }

    public String on() {
        return location + " television is on.";
    }

    public String off() {
        return location + " television is off.";
    }
}
