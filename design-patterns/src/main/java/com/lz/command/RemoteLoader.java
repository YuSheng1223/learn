package com.lz.command;

/**
 * @author lz
 * @Package com.lz.command
 * @Description:
 * @date 2021/12/4 17:16
 */
public class RemoteLoader {

    public static void main(String[] args) {

        RemotrContrl remotrContrl = new RemotrContrl();


        Light light = new Light();
        Stereo stereo = new Stereo();


        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remotrContrl.setCommand(0,lightOnCommand,lightOffCommand);
        remotrContrl.setCommand(1,stereoOnCommand,stereoOffCommand);

        System.out.println(remotrContrl.toString());

        remotrContrl.onButtonWasPushed(0);
        remotrContrl.offButtonWasPushed(0);
        remotrContrl.undoButtonWasPushed(0);

        remotrContrl.onButtonWasPushed(1);
        remotrContrl.offButtonWasPushed(1);
    }
}
