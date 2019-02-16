package headfirst.pattern.command.demo.command.off;

import headfirst.pattern.command.demo.command.Command;
import headfirst.pattern.command.demo.elecapp.WaterHeater;

/**
 * @author : Lin Can
 * @date : 2019/2/16 20:22
 */
public class WaterHeaterOffCommand implements Command {
    private WaterHeater waterHeater;

    public WaterHeaterOffCommand(WaterHeater waterHeater) {
        this.waterHeater = waterHeater;
    }

    @Override
    public String execute() {
        return waterHeater.off();
    }

    @Override
    public String undo() {
        return waterHeater.on();
    }
}
