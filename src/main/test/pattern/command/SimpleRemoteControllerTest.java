package pattern.command;

import headfirst.pattern.command.demo.Command;
import headfirst.pattern.command.demo.Light;
import headfirst.pattern.command.demo.LightCommand;
import headfirst.pattern.command.demo.SimpleRemoteController;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author : Lin Can
 * @date : 2019/2/11 23:27
 */
public class SimpleRemoteControllerTest {
    @Test
    public void testTurnOnLight () {
        String name = "White Light";
        Light light = new Light(name);
        Command command = new LightCommand(light);
        SimpleRemoteController simpleRemoteController = new SimpleRemoteController();
        simpleRemoteController.setCommand(command);
        Assert.assertEquals(light.on(),simpleRemoteController.pressDown());
    }
}
