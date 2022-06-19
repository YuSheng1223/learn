package com.lz.state;

/**
 * @author lz
 * @Package com.lz.state
 * @Description:
 * @date 2022/4/10 14:49
 */
public class SoldOutState implements State{

    GumballMachineV2 gumballMachine;

    public SoldOutState(GumballMachineV2 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter; the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject,you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned ,but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}