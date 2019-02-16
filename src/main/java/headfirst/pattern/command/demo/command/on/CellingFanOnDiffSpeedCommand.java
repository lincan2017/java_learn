package headfirst.pattern.command.demo.command.on;

import headfirst.pattern.command.demo.command.Command;
import headfirst.pattern.command.demo.elecapp.CellingFan;

/**
 * @author : Lin Can
 * @date : 2019/2/16 17:20
 */
public abstract class CellingFanOnDiffSpeedCommand implements Command {
    CellingFan cellingFan;

    int speed;

    int prevSpeed;

    CellingFanOnDiffSpeedCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public String undo() {
        String result;
        if (prevSpeed == CellingFan.HIGH) {
            prevSpeed = speed;
            result = cellingFan.high();
            speed = cellingFan.getSpeed();
        } else if (prevSpeed == CellingFan.MEDIUM) {
            prevSpeed = speed;
            result = cellingFan.medium();
            speed = cellingFan.getSpeed();
        } else if (prevSpeed == CellingFan.LOW) {
            prevSpeed = speed;
            result = cellingFan.low();
            speed = cellingFan.getSpeed();
        } else if (prevSpeed == CellingFan.OFF) {
            prevSpeed = speed;
            result = cellingFan.off();
            speed = cellingFan.getSpeed();
        } else {
            throw new RuntimeException("ERROR! PrevSpeed is Illegal");
        }

        return result;
    }
}
