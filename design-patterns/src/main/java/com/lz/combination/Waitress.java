package com.lz.combination;

/**
 * @author lz
 * @Package com.lz.combination
 * @Description:
 * @date 2022/4/3 16:11
 */
public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }


    public void printMenu() {
        allMenus.print();
    }

}
