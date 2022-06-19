package com.lz.adpter;

/**
 * @author lz
 * @Package com.lz.adpter
 * @Description:
 * @date 2022/2/20 10:01
 */
public class WildTurkey implements Turkey {

    public void gobble() {
        System.out.println("Gobble goggle");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}