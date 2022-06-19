package com.lz.command;

/**
 * @author lz
 * @Package com.lz.command
 * @Description: 没有绑定命令
 * @date 2021/12/4 17:01
 */
public class NoCommand implements Command {

    @Override
    public void exexute() {
        System.out.println("没有绑定命令，啥也不干");
    }

    @Override
    public void undo() {
        System.out.println("没有绑定命令，啥也不干");
    }
}
