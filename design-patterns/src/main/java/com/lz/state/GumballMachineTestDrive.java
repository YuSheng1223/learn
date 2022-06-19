package com.lz.state;

/**
 * @author lz
 * @Package com.lz.state
 * @Description:
 * @date 2022/4/10 14:48
 */
public class GumballMachineTestDrive {

    public static void main(String[] args) {

        GumballMachineV2 gumballMachine = new GumballMachineV2(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();

        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

    }

}