package headfirst.pattern.command.demo.elecapp;

/**
 * @author : Lin Can
 * @date : 2019/2/13 21:51
 */
public class CellingFan {
    private String location;

    public CellingFan(String location) {
        this.location = location;
    }

    public String high () {
        return location + " celling fan is run on high.";
    }

    public String off () {
        return location + " celling fan is off.";
    }
}
