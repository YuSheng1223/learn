package com.lz.iterator;

/**
 * @author lz
 * @Package com.lz.iterator
 * @Description:
 * @date 2022/4/3 16:00
 */
public class DinnerMenuItearator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinnerMenuItearator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem item = items[position];
        position++;
        return item;
    }
}