package headfirst.pattern.command.demo.command.on;

import headfirst.pattern.command.demo.command.Command;
import headfirst.pattern.command.demo.elecapp.CellingFan;

/**
 * @author : Lin Can
 * @date : 2019/2/13 22:00
 */
public class CellingFanOnCommand implements Command {
    private CellingFan cellingFan;

    public CellingFanOnCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public String execute() {
        return cellingFan.high();
    }
}
