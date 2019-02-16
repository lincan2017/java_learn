package headfirst.pattern.command.demo.command.off;

import headfirst.pattern.command.demo.command.Command;
import headfirst.pattern.command.demo.elecapp.Television;

/**
 * @author : Lin Can
 * @date : 2019/2/16 20:22
 */
public class TelevisionOffCommand implements Command {
    private Television television;

    public TelevisionOffCommand(Television television) {
        this.television = television;
    }

    @Override
    public String execute() {
        return television.off();
    }

    @Override
    public String undo() {
        return television.on();
    }
}
