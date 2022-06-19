package com.lz.iterator;

import java.util.ArrayList;

/**
 * @author lz
 * @Package com.lz.iterator
 * @Description:
 * @date 2022/4/3 16:03
 */
public class PancakeHouseMenuIterator implements  Iterator {

    ArrayList<MenuItem> menuItems;
    int position = 0;


    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size()) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem item = menuItems.get(position);
        position++;
        return item;
    }
}
