package com.lz.adpter;

/**
 * @author lz
 * @Package com.lz.adpter
 * @Description:
 * @date 2022/2/20 10:01
 */
public class DuckTestDrive {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        duck.quack();
        duck.fly();

        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
