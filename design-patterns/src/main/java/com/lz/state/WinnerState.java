package com.lz.state;

/**
 * @author lz
 * @Package com.lz.state
 * @Description:
 * @date 2022/4/10 14:55
 */
public class WinnerState implements State {


    GumballMachineV2 gumballMachine;

    public WinnerState(GumballMachineV2 gumballMachine) {
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
        System.out.println("You're a winner , you get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if(gumballMachine.getCount() > 0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }
            System.out.println("Oops , out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}