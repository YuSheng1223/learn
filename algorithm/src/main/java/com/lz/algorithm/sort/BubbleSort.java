package com.lz.algorithm.sort;

import java.util.Arrays;

/**
 * @author lz
 * @Package com.lz.algorithm.sort
 * @Description: 冒泡
 * @date 2022/7/6 17:14
 */
public class BubbleSort {

    /***
     * 冒泡排序是一种稳定排序  值相等的元素并不会打乱原本的顺序。
     * 时间复杂度 最好是O(n)  最差是 O(n^2)
     */


    /***
     *  冒泡  第一版
     * @param array
     */
    public static void sortVersion1(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                int temp = 0;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /***
     *  冒泡 第二版  如果先排序的数组已经有序 就不需要继续遍历了
     * @param array
     */
    public static void sortVersion2(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            //  有序标记  每一轮的初始值都是true
            boolean isSorted = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                int temp = 0;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    // 因为有元素进行交换 所有不是有序的 标记变为false
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }

    }

    /***
     * 冒泡 第三版
     *  按照现有的逻辑 有序区的长度和排序的轮数是相等的，例如 第一轮排序过后的有序区的长度是1  第二轮后是2
     *  实际上，数列真正的有序区可能会大于这个长度
     *  在每一轮排序后，记录下来最后一次元素交换的位置，该位置即为无序数列的边界，再往后就是有序区了
     * @param array
     */
    public static void sortVersion3(int[] array){
        // 记录最后一次交换的位置
        int lastExchangeIndex = 0;
        // 无序数列的边界，每次比较只需要比到这里为止
        int sortBorder = array.length - 1;
        for(int i = 0; i< array.length - 1 ; i++){
            // 有序标记 每一轮的初始值都是true
            boolean isSorted = true;
            for(int j = 0 ; j <sortBorder ; j++){
                int temp = 0;
                if(array[j] > array [j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSorted = false;
                    lastExchangeIndex = j;
                }
            }
            sortBorder = lastExchangeIndex;
            if(isSorted){
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 8, 6, 3, 9, 2, 1, 7};
        sortVersion3(array);
        System.out.println(Arrays.toString(array));
    }
}
