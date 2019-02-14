package headfirst.pattern.command.demo.command.off;

import headfirst.pattern.command.demo.command.Command;
import headfirst.pattern.command.demo.elecapp.CellingFan;

/**
 * @author : Lin Can
 * @date : 2019/2/13 22:00
 */
public class CellingFanOffCommand implements Command {
    private CellingFan cellingFan;

    public CellingFanOffCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public String execute() {
        return cellingFan.off();
    }

    @Override
    public String undo() {
        return cellingFan.high();
    }
}
