package com.lz.command;

/**
 * @author lz
 * @Package com.lz.command
 * @Description:
 * @date 2021/12/4 17:08
 */
public class LightOffCommand implements Command {

    Light light;


    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void exexute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
