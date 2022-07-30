package com.lz.algorithm.binaryHeap;

import java.util.Arrays;

/**
 * @author lz
 * @Package com.lz.algorithm.binaryHeap
 * @Description: 二叉堆操作
 * @date 2022/6/26 16:32
 */
public class BinaryHeapOperate {

    // 二叉堆本质上是一种完全二叉树 分为最大堆 最小堆
    // 最大堆 ： 最大堆的任何一个父节点的值，都大于或等于它左、右孩子节点的值
    // 最小堆 ： 最小堆的任何一个父节点的值，都小于或等于它左、右孩子节点的值
    // 二叉堆以数组的形式存储时， 假设父节点的下标是parent ，那么它的左孩子下标就是2*parent+1 右孩子下标就是2*parent+2

    /***
     *  对于一个完全二叉树，在填满的情况下（非叶子节点都有两个子节点），每一层的元素个数是上一层的二倍，根节点数量是1，
     *  所以最后一层的节点数量，一定是之前所有层节点总数+1，
     *  所以，我们能找到最后一层的第一个节点的索引，即节点总数/2（根节点索引为0），
     *  这也就是第一个叶子节点，
     *  所以第一个非叶子节点的索引就是第一个叶子结点的索引-1。那么对于填不满的二叉树呢？
     *  这个计算方式仍然适用，当我们从上往下，从左往右填充二叉树的过程中，第一个叶子节点，一定是序列长度/2，
     *  所以第最后一个非叶子节点的索引就是 arr.len / 2 -1，
     * @param args
     */

    public static void main(String[] args) {
        int array[] = new int[]{1, 3, 2, 6, 5, 7, 8, 9, 10, 0};
        upAdjust(array);
        System.out.println(Arrays.toString(array));

        array = new int[]{7, 1, 3, 10, 5, 2, 8, 9, 6};
        buildHeap(array);
        System.out.println(Arrays.toString(array));

    }

    /***
     *  构建堆
     * @param array 待调整的堆
     */
    public static void buildHeap(int[] array) {
        // 从最后一个非叶子节点开始，依次做下沉调整
        for (int i = (array.length - 2) / 2; i >= 0; i--) {
            downAdjust(array, i, array.length);
        }
    }

    /***
     *  下沉调整
     * @param array
     * @param parentIndex
     * @param length
     */
    public static void downAdjust(int[] array, int parentIndex, int length) {
        // temp保存父节点值 用于最后的赋值
        int temp = array[parentIndex];
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < length) {
            // 如果有右孩子，且右孩子小于左孩子的值，则定位到右孩子
            if (childIndex + 1 < length && array[childIndex + 1] < array[childIndex]) {
                childIndex++;
            }
            // 如果父节点小于任何一个孩子的值，则直接跳出
            if (temp <= array[childIndex]) {
                break;
            }
            // 无需真正的交换，单向赋值即可
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = 2 * childIndex + 1;
        }
        array[parentIndex] = temp;
    }

    /***
     *  上浮调整
     * @param array 待调整的堆
     */
    public static void upAdjust(int[] array) {

        int childIndex = array.length - 1;
        int parentIndex = (childIndex - 1) / 2;
        // temp保存插入的叶子节点值，用于最后的赋值
        int temp = array[childIndex];
        while (childIndex > 0 && temp < array[parentIndex]) {
            // 无需真正的交换 单向赋值即可
            array[childIndex] = array[parentIndex];
            childIndex = parentIndex;
            parentIndex = (parentIndex - 1) / 2;
        }
        array[childIndex] = temp;
    }


}
