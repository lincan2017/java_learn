package headfirst.pattern.command.demo.command.off;

import headfirst.pattern.command.demo.command.Command;
import headfirst.pattern.command.demo.elecapp.Stereo;
import org.apache.commons.lang3.StringUtils;

/**
 * @author : Lin Can
 * @date : 2019/2/14 16:49
 */
public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public String execute() {
        return stereo.off();
    }

    @Override
    public String undo() {
        return stereo.on() +
                StringUtils.LF +
                stereo.setCD() +
                StringUtils.LF +
                stereo.setVolume(11);
    }
}
