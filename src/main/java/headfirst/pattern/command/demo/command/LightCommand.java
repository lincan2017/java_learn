package headfirst.pattern.command.demo.command;

import headfirst.pattern.command.demo.elecapp.Light;

/**
 * @author : Lin Can
 * @date : 2019/2/11 23:24
 */
public class LightCommand implements Command {

    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.on();
    }
}
