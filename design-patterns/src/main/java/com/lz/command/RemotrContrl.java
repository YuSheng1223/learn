package com.lz.command;

import java.util.Arrays;

/**
 * @author lz
 * @Package com.lz.command
 * @Description: 遥控器
 * @date 2021/12/4 16:59
 */
public class RemotrContrl {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    /***
     * 遥控器初始化
     */
    public RemotrContrl() {

        onCommands = new Command[7];
        offCommands = new Command[7];
        // 默认绑定一个空命令
        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    /***
     * 将具体的命令绑定到对应的遥控器的槽上
     * @param slot
     * @param onCommand
     * @param offCommand
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /***
     * 遥控器具体的行为 -- 第slot个按钮被按下 开
     * @param slot
     */
    public void onButtonWasPushed(int slot) {
        onCommands[slot].exexute();
        // 当按钮按下 记录触发的命令
        undoCommand = onCommands[slot];
    }

    /***
     * 遥控器具体的行为 -- 第slot个按钮被按下 关
     * @param slot
     */
    public void offButtonWasPushed(int slot) {
        offCommands[slot].exexute();
        undoCommand = offCommands[slot];
    }

    /***
     *  撤销按钮被按下 触发撤销方法
     * @param slot
     */
    public void undoButtonWasPushed(int slot){
        undoCommand.undo();
    }

    @Override
    public String toString() {

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-----------------Remote Contrl---------------------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + " " + onCommands[i].getClass().getName() + "      " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
