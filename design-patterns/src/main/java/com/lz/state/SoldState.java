package com.lz.state;

/**
 * @author lz
 * @Package com.lz.state
 * @Description:
 * @date 2022/4/10 14:49
 */
public class SoldState implements State {


    GumballMachineV2 gumballMachine;

    public SoldState(GumballMachineV2 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("please wait , we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry , you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops , out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}