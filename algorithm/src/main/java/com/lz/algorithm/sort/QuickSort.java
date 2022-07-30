package com.lz.algorithm.sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author lz
 * @Package com.lz.algorithm.sort
 * @Description: 快速排序
 * @date 2022/7/9 16:12
 */
public class QuickSort {


    /***
     * 快速排序 采用分治法
     * 每一轮挑选一个基准元素，并让其他比它大的元素移动到另一边，比它小的元素移动到数组的另一边，从而把数组拆解称两部分。
     * 然后继续将这两部分继续上面的过程
     */

    /***
     *  快速排序中交换元素的方法：
     *  双边循环法
     *  第一个元素为基准元素  right指针指向最后一个元素  left指针指向第一个元素
     *  首先right指针向左移动 找到第一个小于基准元素的值
     *  然后left指针向右移动 找到第一个大于基准元素的值  left指针和right指针位置的值互换 然后继续移动两个指针
     *  直到两个指针的指向同一个位置  将基准元素放在这个位置
     */

    public static void bilateralQuickSort(int[] array, int startIndex, int endIndex) {
        // 递归结束条件 startIndex >= endIndex
        if (startIndex >= endIndex) {
            return;
        }

        // 得到基准元素位置
        int pivotIndex = bilateralPartition(array, startIndex, endIndex);
        // 根据基准元素 分成两部分进行递归排序
        bilateralQuickSort(array, startIndex, pivotIndex - 1);
        bilateralQuickSort(array, pivotIndex+1, endIndex);

    }

    /***
     *  分治法 双边循环法
     * @param array 待交换的数组
     * @param startIndex 起始下标
     * @param endIndex  结束下标
     * @return
     */
    private static int bilateralPartition(int[] array, int startIndex, int endIndex) {

        // 取第一个位置的元素作为基准元素
        int pivot = array[startIndex];
        int left = startIndex;
        int right = endIndex;

        while (left != right){
            // 控制right指针比较并左移
            while (left < right && array[right] > pivot){
                right--;
            }
            // 控制left指针比较并右移
            while(left < right && array[left] <= pivot){
                left++;
            }
            // 交换left和right位置的元素
            if(left< right){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }

        // pivot 和指针重合点交换
        array[startIndex] = array[left];
        array[left] = pivot;

        return left;

    }


    /***
     * 快速排序中交换元素的方法：
     *  单边循环法
     *   设置基准元素pivot，同时设置一个mark指针指向数组的起始位置，mark指针达标小于基准元素的区域边界
     *   从基准元素位置开始遍历，如果遍历到的元素小于基准元素，那么就把mark指针右移一位， 让最新遍历到的元素和mar指针所在位置的元素交换位置
     *
     */

    public static void unilateralQuickSort(int[] array, int startIndex, int endIndex) {
        // 递归结束条件 startIndex >= endIndex
        if (startIndex >= endIndex) {
            return;
        }

        // 得到基准元素位置
        int pivotIndex = unilateralPartition(array, startIndex, endIndex);
        // 根据基准元素 分成两部分进行递归排序
        unilateralQuickSort(array, startIndex, pivotIndex - 1);
        unilateralQuickSort(array, pivotIndex+1, endIndex);

    }


    /***
     *  单边循环法
     * @param array 待交换的数组
     * @param startIndex 起始下标
     * @param endIndex  结束下标
     * @return  切分的索引
     */
    public static int unilateralPartition(int[] array, int startIndex, int endIndex) {
        // 取第一个位置的元素作为基准元素
        int pivot = array[startIndex];
        int mark = startIndex;

        for(int i = startIndex+1; i <=endIndex ; i++){
            if(array[i] < pivot){
                mark++;
                int temp = array[mark];
                array[mark] = array[i];
                array[i] = temp;
            }
        }

        array[startIndex] = array[mark];
        array[mark] = pivot;

        return mark;
    }


    /***
     * 上面的两种方式都是递归  下面使用一种栈的方式来代替
     */

    public static void stackQuickSort(int[] array, int startIndex , int endIndex){
        // 用一个集合栈来代替递归的函数栈
        Stack<Map<String,Integer>> quickSortStack = new Stack<>();
        //整个数组的起止下标 以哈希的形式入栈
        Map rootParam = new HashMap();
        rootParam.put("startIndex" , startIndex);
        rootParam.put("endIndex" , endIndex);
        quickSortStack.push(rootParam);

        //循环结束条件 栈为空时
        while (!quickSortStack.isEmpty()){
            // 栈顶元素出栈 得到起止下标
            Map<String, Integer> param = quickSortStack.pop();
            // 得到基准元素位置
            int pivotIndex = unilateralPartition(array , param.get("startIndex") , param.get("endIndex"));
            // 根据基准元素分成两部分 把每一部分的起止下标入栈
            if(param.get("startIndex") < pivotIndex -1){
                Map<String,Integer> leftParam = new HashMap<>();
                leftParam.put("startIndex" , param.get("startIndex"));
                leftParam.put("endIndex" , pivotIndex-1);
                quickSortStack.push(leftParam);
            }
            if(pivotIndex +1 < param.get("endIndex")){
                Map<String,Integer> right = new HashMap<>();
                right.put("startIndex" , pivotIndex+1);
                right.put("endIndex" , param.get("endIndex"));
                quickSortStack.push(right);
            }
        }
    }



    public static void main(String[] args) {
        int[] array = new int[]{4, 4, 6, 5, 3, 2, 8, 1};
        stackQuickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
