package com.lz.proxy;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author lz
 * @Package com.lz.proxy
 * @Description:
 * @date 2022/4/16 13:25
 */
public class GumballMonitorTestDrive {

    public static void main(String[] args) {


        try {

            Registry registry = LocateRegistry.getRegistry("localhost");
            // 从Registry中检索远程对象的存根/代理
            GumballMachineRemote remoteMath = (GumballMachineRemote) registry.lookup("gumballMachine");

            GumballMonitor gumballMonitor = new GumballMonitor(remoteMath);
            gumballMonitor.report();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
