package com.lz.command;

/**
 * @author lz
 * @Package com.lz.command
 * @Description: 打开电灯的命令
 * 因为是一个命令 所以实现Command接口
 * @date 2021/12/4 16:37
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void exexute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
