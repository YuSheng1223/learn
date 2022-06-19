package com.lz.iterator;

/**
 * @author lz
 * @Package com.lz.iterator
 * @Description:
 * @date 2022/4/3 16:01
 */
public class MenuTestDrive {


    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu,dinnerMenu);
        waitress.printMenu1();
    }
}