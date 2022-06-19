package com.lz.command;

/**
 * @author lz
 * @Package com.lz.command
 * @Description: 遥控器
 * @date 2021/12/4 16:40
 */
public class SimpleRemoteControl {

    /***
     * slot代表每次按按钮所要执行的命令
     */
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    /***
     * 具体的行为 按钮按下  命令执行
     */
    public void buttonWasPressed(){
        slot.exexute();
    }
}
