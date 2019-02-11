package headfirst.pattern.command.demo;

/**
 * @author : Lin Can
 * @date : 2019/2/11 23:22
 */
public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public String on() {
        return name + " is on.";
    }

    public String off() {
        return name + " is off.";
    }
}
