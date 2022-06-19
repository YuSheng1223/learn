package com.lz.command;

/**
 * @author lz
 * @Package com.lz.command
 * @Description:
 * @date 2021/12/4 17:22
 */
public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }


    @Override
    public void exexute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume();
    }
}
