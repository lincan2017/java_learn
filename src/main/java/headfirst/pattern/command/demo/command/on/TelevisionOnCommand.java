package headfirst.pattern.command.demo.command.on;

import headfirst.pattern.command.demo.command.Command;
import headfirst.pattern.command.demo.elecapp.Television;

/**
 * @author : Lin Can
 * @date : 2019/2/16 20:22
 */
public class TelevisionOnCommand implements Command {
    private Television television;

    public TelevisionOnCommand(Television television) {
        this.television = television;
    }

    @Override
    public String execute() {
        return television.on();
    }

    @Override
    public String undo() {
        return television.off();
    }
}
