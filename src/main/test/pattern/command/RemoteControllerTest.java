package pattern.command;

import headfirst.pattern.command.demo.RemoteController;
import headfirst.pattern.command.demo.command.off.CellingFanOffCommand;
import headfirst.pattern.command.demo.command.off.LightOffCommand;
import headfirst.pattern.command.demo.command.off.StereoOffCommand;
import headfirst.pattern.command.demo.command.on.CellingFanOnCommand;
import headfirst.pattern.command.demo.command.on.LightOnCommand;
import headfirst.pattern.command.demo.command.on.StereoOnCommand;
import headfirst.pattern.command.demo.elecapp.CellingFan;
import headfirst.pattern.command.demo.elecapp.Light;
import headfirst.pattern.command.demo.elecapp.Stereo;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author : Lin Can
 * @date : 2019/2/14 17:11
 */
public class RemoteControllerTest {
    @Test
    public void test() {
        //遥控器槽数
        int slotCount = 7;
        //多槽位遥控器
        RemoteController remoteController = new RemoteController(slotCount);

        //客厅的灯
        Light livingRoomLight = new Light("LivingRoom");
        //房间的灯
        Light bedRoomLight = new Light("BedRoom");

        //风扇
        CellingFan fan = new CellingFan("LivingRoom");

        //音响
        Stereo stereo = new Stereo("LivingRoom");

        //开命令
        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOnCommand bedRoomLightOnCommand = new LightOnCommand(bedRoomLight);
        CellingFanOnCommand cellingFanOnCommand = new CellingFanOnCommand(fan);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);

        //关命令
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        LightOffCommand bedRoomLightOffCommand = new LightOffCommand(bedRoomLight);
        CellingFanOffCommand cellingFanOffCommand = new CellingFanOffCommand(fan);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        //为每个插槽关联命令
        remoteController.setCommands(0,livingRoomLightOnCommand,livingRoomLightOffCommand);
        remoteController.setCommands(1,bedRoomLightOnCommand,bedRoomLightOffCommand);
        remoteController.setCommands(2,cellingFanOnCommand,cellingFanOffCommand);
        remoteController.setCommands(3,stereoOnCommand,stereoOffCommand);

        //操作遥控器的结果和直接操作电器的结果一样
        Assert.assertEquals(livingRoomLight.on(),remoteController.onButtonWasPressed(0));
        Assert.assertEquals(livingRoomLight.off(),remoteController.offButtonWasPressed(0));
        Assert.assertEquals(bedRoomLight.on(),remoteController.onButtonWasPressed(1));

        //撤销功能
        Assert.assertEquals(bedRoomLight.off(),remoteController.undo());

        Assert.assertEquals(bedRoomLight.off(),remoteController.offButtonWasPressed(1));
        Assert.assertEquals(fan.high(),remoteController.onButtonWasPressed(2));
        Assert.assertEquals(fan.off(),remoteController.offButtonWasPressed(2));

        //撤销功能
        Assert.assertEquals(fan.high(),remoteController.undo());

        Assert.assertEquals(stereo.on() +
                StringUtils.LF +
                stereo.setCD() +
                StringUtils.LF +
                stereo.setVolume(11), remoteController.onButtonWasPressed(3));
        Assert.assertEquals(stereo.off(),remoteController.offButtonWasPressed(3));

        //撤销功能
        Assert.assertEquals(stereo.on() +
                StringUtils.LF +
                stereo.setCD() +
                StringUtils.LF +
                stereo.setVolume(11), remoteController.undo());
    }
}
