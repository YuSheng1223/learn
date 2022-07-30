package com.lz.algorithm.sort;

import java.util.Arrays;

/**
 * @author lz
 * @Package com.lz.algorithm.sort
 * @Description: 堆排序
 * @date 2022/7/10 16:11
 */
public class HeapSort {

    /***
     * 堆排序  最大堆的堆顶是整个堆中的最大元素
     *    每一次删除旧堆顶 调整后的新的堆顶都是大小仅次于旧堆顶的结点
     *
     */


    /***
     * 把无序数组构建成二叉堆，需要从小到大排序，就构建成最大堆。需要从大到小排序 就构建成最小堆
     *  循环删除堆顶元素，替换到二叉堆的末尾，调整堆产生新的堆顶
     */


    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 6, 5, 7, 8, 9, 10, 0};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    /***
     * 堆排序
     * @param array 待调整的堆
     */
    private static void heapSort(int[] array) {
        // 把无序的数组构建成最大堆      i初始值为第一个非叶子节点的索引 即(n/2) -1 或者 (n-2)/2
                                        // i-- 说明在i之前的所有结点都是非叶子节点 一个个调整
        for (int i = (array.length - 2) / 2; i >= 0; i--) {
            downAdjust(array, i, array.length);
        }
        System.out.println(Arrays.toString(array));
        // 循环删除堆顶元素 移动到集合尾部 调整堆产生新的堆顶
        for (int i = array.length - 1; i > 0; i--) {
            // 最后一个元素和第一个元素进行交换
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            downAdjust(array, 0, i);
        }
    }

    /***
     * 下沉调整
     * @param array 待调整的堆
     * @param parentIndex 需要下沉的父节点
     * @param length 堆的有效大小
     */
    private static void downAdjust(int[] array, int parentIndex, int length) {

        int temp = array[parentIndex];
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < length) {
            if (childIndex + 1 < length && array[childIndex + 1] > array[childIndex]) {
                childIndex++;
            }
            if (temp >= array[childIndex]) {
                break;
            }
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = 2 * childIndex + 1;
        }

        array[parentIndex] = temp;
    }
}
