package com.lz.combination;

/**
 * @author lz
 * @Package com.lz.combination
 * @Description:
 * @date 2022/4/3 16:13
 */
public class MenuTestDrive {

    public static void main(String[] args) {

        MenuComponent pancakeHouseMenu =  new Menu("PANCAKE HOUSE MENU","Breakfast");
        MenuComponent dinnerMenu =  new Menu("DINNER MENU","Lunch");
        MenuComponent cafeMenu =  new Menu("CAFE MENU","Dinner");
        MenuComponent dessertMenu =  new Menu("DESSERT MENU","Dessert of course");

        MenuComponent allMenus =  new Menu("ALL MENUS","All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dinnerMenu);

        dinnerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti............",
                true,
                3.89
        ));

        dinnerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Applie Pie..........",
                true,
                1.59
        ));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
