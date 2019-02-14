package headfirst.pattern.command.demo;

import headfirst.pattern.command.demo.command.Command;

/**
 * 简单的控制器
 * 控制器无需知道实际控制的是什么物品，物品是否能用相同的接口接入
 * 需要接入的各种物品，只需要有自己对应的Command实现类即可
 * @author : Lin Can
 * @date : 2019/2/11 23:25
 */
public class SimpleRemoteController {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public String pressDown () {
        return command.execute();
    }
}
