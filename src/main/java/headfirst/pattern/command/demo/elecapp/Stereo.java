package headfirst.pattern.command.demo.elecapp;

/**
 * @author : Lin Can
 * @date : 2019/2/14 16:39
 */
public class Stereo {

    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    public String on() {
        return location + " stereo is on.";
    }


    public String setCD() {
        return location + " stereo is set for CD input.";
    }

    public String setVolume(int volume) {
        return location + " stereo volume is set to " + volume;
    }

    public String off() {
        return location + " stereo is off.";
    }
}
