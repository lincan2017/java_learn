package headfirst.pattern.command.demo;

import headfirst.pattern.command.demo.command.Command;
import headfirst.pattern.command.demo.command.NoCommand;

/**
 * @author : Lin Can
 * @date : 2019/2/14 16:51
 */
public class RemoteController {

    private Command[] onCommands;

    private Command[] offCommands;

    private int slotCount;

    public RemoteController(int slotCount) {
        this.slotCount = slotCount;
        onCommands = new Command[slotCount];
        offCommands = new Command[slotCount];

        //初始化为noCommand对象的数组,则在调用xxButtonWasPressed的时候无需作非空判断
        Command noCommand = new NoCommand();
        for (int i = 0; i < slotCount; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommands(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public String onButtonWasPressed(int slot) {
        if (slot >= slotCount) {
            throw new RuntimeException("ERROR with slot" + slot);
        }
        return onCommands[slot].execute();
    }

    public String offButtonWasPressed(int slot) {
        return offCommands[slot].execute();
    }
}
