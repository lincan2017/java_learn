package headfirst.pattern.command.demo.command.on;

import headfirst.pattern.command.demo.command.Command;
import headfirst.pattern.command.demo.elecapp.Stereo;
import org.apache.commons.lang3.StringUtils;

/**
 * @author : Lin Can
 * @date : 2019/2/14 16:43
 */
public class StereoOnCommand implements Command {

    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public String execute() {
        return stereo.on() +
                StringUtils.LF +
                stereo.setCD() +
                StringUtils.LF +
                stereo.setVolume(11);
    }
}
