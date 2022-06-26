package com.lz.algorithm.array;


public class ArrayOperate {


    private int[] array;

    public ArrayOperate(int capacity) {
        this.array = new int[capacity];
    }

    /***
     *  数组插入元素 时间复杂度O(n)
     * @param element
     * @param index
     */
    public void insert(int element, int index) {
        if (index < 0 || index > array.length) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = array.length - 1; i >= index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
    }

    /***
     * 删除某个元素  时间复杂度O(n)
     * @param index
     * @return
     */
    public int delete(int index) {
        if (index < 0 || index > array.length) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        return array[index];
    }

    /***
     * 扩容 时间复杂度O(n)
     */
    public void resize() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public static void main(String[] args) {
        ArrayOperate midInsert = new ArrayOperate(10);
        midInsert.insert(5, 5);
        midInsert.insert(6, 6);
        midInsert.insert(7, 9);

        for (int i = 0; i < midInsert.array.length; i++) {
            System.out.print(midInsert.array[i] + " ");
        }
        System.out.println("");

        midInsert.delete(6);

        for (int i = 0; i < midInsert.array.length; i++) {
            System.out.print(midInsert.array[i] + " ");
        }
    }


}
