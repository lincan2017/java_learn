package headfirst.pattern.command.demo.command.on;

import headfirst.pattern.command.demo.elecapp.CellingFan;

/**
 * @author : Lin Can
 * @date : 2019/2/14 20:59
 */
public class CellingFanOnHighSpeedCommand extends CellingFanOnDiffSpeedCommand {

    public CellingFanOnHighSpeedCommand(CellingFan cellingFan) {
        super(cellingFan);
    }

    @Override
    public String execute() {
        prevSpeed = cellingFan.getSpeed();
        String result = cellingFan.high();
        speed = cellingFan.getSpeed();
        return result;
    }
}
