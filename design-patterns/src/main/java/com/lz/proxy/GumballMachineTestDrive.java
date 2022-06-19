package com.lz.proxy;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author lz
 * @Package com.lz.proxy
 * @Description:
 * @date 2022/4/16 13:16
 */
public class GumballMachineTestDrive {

    public static void main(String[] args) {

        GumballMachineRemote gumballMachineRemote = null;

        try {

            int count = 100;
            gumballMachineRemote = new GumballMachine("m1.com", count);
            LocateRegistry.createRegistry(1099);
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("gumballMachine", gumballMachineRemote);
            System.out.println("ok");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
