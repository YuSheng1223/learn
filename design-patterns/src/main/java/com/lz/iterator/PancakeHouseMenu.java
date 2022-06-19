package com.lz.iterator;

import java.util.ArrayList;

/**
 * @author lz
 * @Package com.lz.iterator
 * @Description:
 * @date 2022/4/3 15:58
 */
public class PancakeHouseMenu {

    ArrayList menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList();

        addItem("K&B Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, and toast", false, 2.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);

    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return  new PancakeHouseMenuIterator(menuItems);
    }
    // .......
}
