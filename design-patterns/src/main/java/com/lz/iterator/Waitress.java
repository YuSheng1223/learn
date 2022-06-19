package com.lz.iterator;

import java.util.ArrayList;

/**
 * @author lz
 * @Package com.lz.iterator
 * @Description:
 * @date 2022/4/3 15:59
 */
public class Waitress {

    PancakeHouseMenu pancakeHouseMenu;
    DinnerMenu dinnerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }


    void printMenu1() {

        Iterator iterator = pancakeHouseMenu.createIterator();
        Iterator iterator1 = dinnerMenu.createIterator();
        System.out.println("Menu\n------------\nPancakeHouse");
        printMenu(iterator);
        System.out.println("Menu\n------------\nDinner");
        printMenu(iterator1);

    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }

    }
    // 输出早餐
//    printBreakfaseMenu();
//    // 输出午餐
//    printLunchMenu();
//    // 输出素食
//    printVegetarianMenu();
//    // 是否为素食
//    isItemVegetarian(name);
}