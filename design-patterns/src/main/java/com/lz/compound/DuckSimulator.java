package com.lz.compound;

/**
 * @author lz
 * @Package com.lz.compound
 * @Description: 能够生产鸭子 并且确认鸭子会呱呱叫的模拟器  测试类
 * @date 2022/4/18 22:23
 */
public class DuckSimulator {

    public static void main(String[] args) {

        DuckSimulator duckSimulator = new DuckSimulator();

        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        duckSimulator.simulate(countingDuckFactory);

    }

    private void simulate(AbstractDuckFactory countingDuckFactory) {


        Quackable redheadDuck = countingDuckFactory.createRedheadDuck();
        Quackable duckCall = countingDuckFactory.createDuckCall();
        Quackable rubberDuck = countingDuckFactory.createRubberDuck();
        GooseAdapter gooseAdapter = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator: With Composite -  Flocks");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseAdapter);

        Flock flockOfMallards = new Flock();

        Quackable mallardDuck1 = countingDuckFactory.createMallardDuck();
        Quackable mallardDuck2 = countingDuckFactory.createMallardDuck();
        Quackable mallardDuck3 = countingDuckFactory.createMallardDuck();
        Quackable mallardDuck4 = countingDuckFactory.createMallardDuck();

        flockOfMallards.add(mallardDuck1);
        flockOfMallards.add(mallardDuck2);
        flockOfMallards.add(mallardDuck3);
        flockOfMallards.add(mallardDuck4);


        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator : Whole Flock Simulation");

        simulate(flockOfDucks);

        System.out.println("\nDuck Simulator : Wallard Flock Simulation");

        System.out.println("\n Duck Simulator : With Observer");

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfMallards);

        System.out.println("鸭子叫了 " + QuackCounter.numberOfQuacks + " 次");


    }

    private void simulate(Quackable rubberDuck) {
        rubberDuck.quack();
    }
}
