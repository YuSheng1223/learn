package com.lz.iterator;

/**
 * @author lz
 * @Package com.lz.iterator
 * @Description:
 * @date 2022/4/3 15:59
 */
public class DinnerMenu {
    static final int MAX_ITEMS = 6;

    int numberOfItems = 0;

    MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetraian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);

        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);

    }


    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry,menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
        }
        numberOfItems++;
    }

    // 这个方法不再需要了
//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }

    public Iterator createIterator(){
        return  new DinnerMenuItearator(menuItems);
    }
}
