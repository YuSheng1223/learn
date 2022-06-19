package com.lz.combination;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author lz
 * @Package com.lz.combination
 * @Description:
 * @date 2022/4/3 16:09
 */
public class Menu extends  MenuComponent{
    // 用来存储子菜单或者菜单项
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return  (MenuComponent)menuComponents.get(i);
    }

    @Override
    public String getName() {
        return  name;
    }

    @Override
    public String getDescription() {
        return  description;
    }


    @Override
    public void print() {
        System.out.println("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("------------------------");
        Iterator iterator = menuComponents.iterator();

        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }

    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
