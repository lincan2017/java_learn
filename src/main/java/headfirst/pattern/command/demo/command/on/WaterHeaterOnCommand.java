package headfirst.pattern.command.demo.command.on;

import headfirst.pattern.command.demo.command.Command;
import headfirst.pattern.command.demo.elecapp.WaterHeater;

/**
 * @author : Lin Can
 * @date : 2019/2/16 20:22
 */
public class WaterHeaterOnCommand implements Command {
    private WaterHeater waterHeater;

    public WaterHeaterOnCommand(WaterHeater waterHeater) {
        this.waterHeater = waterHeater;
    }

    @Override
    public String execute() {
        return waterHeater.on();
    }

    @Override
    public String undo() {
        return waterHeater.off();
    }
}
