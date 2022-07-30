package com.lz.algorithm.sort;

import java.util.Arrays;

/**
 * @author lz
 * @Package com.lz.algorithm.sort
 * @Description: 鸡尾酒排序
 * 区别于冒泡的单向排序方式 鸡尾酒排序的比较和和交换过程是单向的
 * @date 2022/7/8 17:28
 */
public class CocktailSort {

    /***
     *  鸡尾酒排序
     * @param array
     */
    public static void sort(int[] array){

        int temp = 0;
        for(int i  = 0 ; i < array.length/2 ; i++){
            boolean isSorted = true;
            // 奇数轮 从左向右比较和交换
            for(int j=i ;j<array.length-i-1;j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
            // 在偶数轮之前 将isSorted 重新标记为true
            for(int j = array.length-i-1; j>i ;j--){
                if(array[j]< array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 8, 6, 3, 9, 2, 1, 7};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
