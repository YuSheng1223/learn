package com.lz.command;

/**
 * @author lz
 * @Package com.lz.command
 * @Description:
 * @date 2021/12/4 17:10
 */
public class StereoOnCommand implements Command {

    Stereo stereo;

    public StereoOnCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void exexute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
