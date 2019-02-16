package headfirst.pattern.command.demo.command.on;

import headfirst.pattern.command.demo.command.Command;

/**
 * 宏命令：批量完成多个命令
 * @author : Lin Can
 * @date : 2019/2/16 20:16
 */
public class MacroCommand implements Command {
    private Command [] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public String execute() {
        StringBuilder result = new StringBuilder();
        for (Command command : commands) {
            result.append(command.execute());
        }
        return result.toString();
    }

    @Override
    public String undo() {
        StringBuilder result = new StringBuilder();
        for (Command command : commands) {
            result.append(command.undo());
        }
        return result.toString();
    }
}
