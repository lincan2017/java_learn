package headfirst.pattern.command.demo.command.on;

import headfirst.pattern.command.demo.command.Command;
import headfirst.pattern.command.demo.elecapp.Light;

/**
 * @author : Lin Can
 * @date : 2019/2/11 23:24
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.on();
    }
}
