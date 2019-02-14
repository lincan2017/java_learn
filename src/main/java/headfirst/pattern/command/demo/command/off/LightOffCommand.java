package headfirst.pattern.command.demo.command.off;

import headfirst.pattern.command.demo.command.Command;
import headfirst.pattern.command.demo.elecapp.Light;

/**
 * @author : Lin Can
 * @date : 2019/2/11 23:24
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.off();
    }
}
