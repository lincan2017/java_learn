package headfirst.pattern.command.demo.elecapp;

/**
 * @author : Lin Can
 * @date : 2019/2/13 21:51
 */
public class CellingFan {
    private String location;

    public static final int HIGH = 3;

    public static final int MEDIUM = 2;

    public static final int LOW = 1;

    public static final int OFF = 0;

    private int speed;

    public CellingFan(String location) {
        this.location = location;
    }

    public String high() {
        speed = HIGH;
        return location + " celling fan speed is " + speed;
    }

    public String medium() {
        speed = MEDIUM;
        return location + " celling fan speed is " + speed;
    }

    public String low() {
        speed = LOW;
        return location + " celling fan speed is " + speed;
    }

    public String off() {
        speed = OFF;
        return location + " celling fan speed is " + speed;
    }

    public int getSpeed() {
        return speed;
    }
}
