package com.lz.adpter;

/**
 * @author lz
 * @Package com.lz.adpter
 * @Description:
 * @date 2022/2/20 10:01
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    // 2
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    // 3
    public void quack() {
        turkey.gobble();
    }

    // 4
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }

}