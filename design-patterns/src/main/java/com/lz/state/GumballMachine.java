package com.lz.state;

/**
 * @author lz
 * @Package com.lz.state
 * @Description:
 * @date 2022/4/10 14:47
 */
public class GumballMachine {

    /***
     *  售罄
     */
    final static int SOLD_OUT = 0;
    /***
     * 未投入钱
     */
    final static int NO_QUARTER = 1;
    /***
     * 投入了钱
     */
    final static int HAS_QUARTER = 2;
    /***
     * 卖出糖果
     */
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    /***
     * 初始化 设置糖果数量 如果数量大于0  设置糖果机状态为 未投入钱
     * @param count
     */
    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    /***
     *  动作 投入钱
     */
    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("You can't insert another quarter!");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't insert a quarter; the machine is sold out");
        } else if (state == SOLD) {
            state = HAS_QUARTER;
            System.out.println("please wait , we're already giving you a gumball");
        }
    }

    /***
     *  动作 退回钱
     */
    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("You inserted a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't eject,you haven't inserted a quarter yet");
        } else if (state == SOLD) {
            System.out.println("Sorry , you already turned the crank");
        }
    }


    /***
     *  动作 转动手柄
     */
    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("Turning twice doesn't get you another gumball");
        } else if (state == NO_QUARTER) {
            System.out.println("You turned but there's no quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You turned ,but there are no gumballs");
        } else if (state == HAS_QUARTER) {
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        }
    }


    /***
     *  动作 发放糖果
     */
    public void dispense() {
        if (state == SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            count = count - 1;
            if (count == 0) {
                System.out.println("Oops,out of gumballs");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("You need to pay first ");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        } else if (state == HAS_QUARTER) {
            System.out.println("No gumball dispensed");
        }
    }
}
