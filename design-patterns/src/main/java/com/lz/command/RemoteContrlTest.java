package com.lz.command;

/**
 * @author lz
 * @Package com.lz.command
 * @Description: 遥控器测试
 * @date 2021/12/4 16:42
 */
public class RemoteContrlTest {

    public static void main(String[] args) {
        // 遥控器
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        // 灯
        Light light = new Light();
        // 亮灯的命令
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        // 将命令绑作为遥控器的一个槽绑定
        simpleRemoteControl.setCommand(lightOnCommand);
        // 遥控器按下
        simpleRemoteControl.buttonWasPressed();
    }
}
