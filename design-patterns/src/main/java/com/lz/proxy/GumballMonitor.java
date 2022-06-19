package com.lz.proxy;

/**
 * @author lz
 * @Package com.lz.proxy
 * @Description:
 * @date 2022/4/16 13:07
 */
public class GumballMonitor {

    GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine : " + gumballMachine.getLocation());
            System.out.println("Current inventory: " + gumballMachine.getCount());
            System.out.println("Current state : " + gumballMachine.getState());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
