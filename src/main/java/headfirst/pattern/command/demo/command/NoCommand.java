package headfirst.pattern.command.demo.command;

/**
 * @author : Lin Can
 * @date : 2019/2/14 17:00
 */
public class NoCommand implements Command {
    @Override
    public String execute() {
        return "";
    }
}
