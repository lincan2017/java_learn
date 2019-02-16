package pattern.command;

import headfirst.pattern.command.demo.RemoteController;
import headfirst.pattern.command.demo.command.Command;
import headfirst.pattern.command.demo.command.NoCommand;
import headfirst.pattern.command.demo.command.off.*;
import headfirst.pattern.command.demo.command.on.*;
import headfirst.pattern.command.demo.elecapp.*;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author : Lin Can
 * @date : 2019/2/14 17:11
 */
public class RemoteControllerTest {
    @Test
    public void testCellingFanWithDiffSpeed() {
        int slotCount = 7;
        RemoteController remoteController = new RemoteController(slotCount);

        CellingFan cellingFan = new CellingFan("BedRoom");
        CellingFan cellingFan2 = new CellingFan("BedRoom");

        CellingFanOnHighSpeedCommand highSpeedCommand = new CellingFanOnHighSpeedCommand(cellingFan);
        CellingFanOnMediumSpeedCommand mediumSpeedCommand = new CellingFanOnMediumSpeedCommand(cellingFan);
        CellingFanOnLowSpeedCommand lowSpeedCommand = new CellingFanOnLowSpeedCommand(cellingFan);
        CellingFanOnOffSpeedCommand offSpeedCommand = new CellingFanOnOffSpeedCommand(cellingFan);

        NoCommand noCommand = new NoCommand();
        remoteController.setCommands(0, highSpeedCommand, noCommand);
        remoteController.setCommands(1, mediumSpeedCommand, noCommand);
        remoteController.setCommands(2, lowSpeedCommand, noCommand);
        remoteController.setCommands(3, offSpeedCommand, noCommand);

        Assert.assertEquals(cellingFan2.high(), remoteController.onButtonWasPressed(0));
        Assert.assertEquals(cellingFan2.medium(), remoteController.onButtonWasPressed(1));
        Assert.assertEquals(cellingFan2.low(), remoteController.onButtonWasPressed(2));
        Assert.assertEquals(cellingFan2.off(), remoteController.onButtonWasPressed(3));

        Assert.assertEquals(cellingFan2.low(), remoteController.undo());
    }

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
        remoteController.setCommands(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteController.setCommands(1, bedRoomLightOnCommand, bedRoomLightOffCommand);
        remoteController.setCommands(2, cellingFanOnCommand, cellingFanOffCommand);
        remoteController.setCommands(3, stereoOnCommand, stereoOffCommand);

        //操作遥控器的结果和直接操作电器的结果一样
        Assert.assertEquals(livingRoomLight.on(), remoteController.onButtonWasPressed(0));
        Assert.assertEquals(livingRoomLight.off(), remoteController.offButtonWasPressed(0));
        Assert.assertEquals(bedRoomLight.on(), remoteController.onButtonWasPressed(1));

        //撤销功能
        Assert.assertEquals(bedRoomLight.off(), remoteController.undo());

        Assert.assertEquals(bedRoomLight.off(), remoteController.offButtonWasPressed(1));
        Assert.assertEquals(fan.high(), remoteController.onButtonWasPressed(2));
        Assert.assertEquals(fan.off(), remoteController.offButtonWasPressed(2));

        //撤销功能
        Assert.assertEquals(fan.high(), remoteController.undo());

        Assert.assertEquals(stereo.on() +
                StringUtils.LF +
                stereo.setCD() +
                StringUtils.LF +
                stereo.setVolume(11), remoteController.onButtonWasPressed(3));
        Assert.assertEquals(stereo.off(), remoteController.offButtonWasPressed(3));

        //撤销功能
        Assert.assertEquals(stereo.on() +
                StringUtils.LF +
                stereo.setCD() +
                StringUtils.LF +
                stereo.setVolume(11), remoteController.undo());
    }

    @Test
    public void testMacroCommand() {
        int slotCount = 7;
        RemoteController remoteController = new RemoteController(slotCount);

        Television television = new Television("LivingRoom");
        WaterHeater waterHeater = new WaterHeater("BathRoom");
        Light light = new Light("LivingRoom");

        TelevisionOnCommand televisionOnCommand = new TelevisionOnCommand(television);
        WaterHeaterOnCommand waterHeaterOnCommand = new WaterHeaterOnCommand(waterHeater);
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        TelevisionOffCommand televisionOffCommand = new TelevisionOffCommand(television);
        WaterHeaterOffCommand waterHeaterOffCommand = new WaterHeaterOffCommand(waterHeater);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        Command[] onCommands = {televisionOnCommand, waterHeaterOnCommand, lightOnCommand};
        Command[] offCommands = {televisionOffCommand, waterHeaterOffCommand, lightOffCommand};

        MacroCommand onMacroCommand = new MacroCommand(onCommands);
        MacroCommand offMacroCommand = new MacroCommand(offCommands);

        remoteController.setCommands(0, onMacroCommand, offMacroCommand);

        Assert.assertEquals(television.on() + waterHeater.on() + light.on(),
                remoteController.onButtonWasPressed(0));
        Assert.assertEquals(television.off() + waterHeater.off() + light.off(),
                remoteController.offButtonWasPressed(0));
        Assert.assertEquals(television.on() + waterHeater.on() + light.on(),
                remoteController.undo());
    }
}
