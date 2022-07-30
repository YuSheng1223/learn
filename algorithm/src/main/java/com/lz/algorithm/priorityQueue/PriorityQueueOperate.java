package com.lz.algorithm.priorityQueue;

import java.util.Arrays;

/**
 * @author lz
 * @Package com.lz.algorithm.priorityQueue
 * @Description: 优先队列
 * @date 2022/7/3 10:33
 */
public class PriorityQueueOperate {

    // 最大优先队列 无论入队顺序如何 都是当前最大的元素优先出队
    // 最小优先队列 无论入队顺序如何 都是当前最小的元素优先出队

    // 使用最大堆来实现最大优先队列 这样的话，每一次入队操作都是堆的插入操作，每一次出队操作就是删除堆顶结点

    // 二叉堆结点的上浮和下沉的时间复杂度都是 O(logn)，所以优先队列的入队和出队的时间复杂度也是O(logn)

    private int[] array;

    private int size;

    public PriorityQueueOperate() {
        array = new int[32];
    }

    /***
     * 入队
     * @param key
     */
    public void enQueue(int key) {
        //队列长度超出范围 扩容
        if (size >= array.length) {
            resize();
        }

        array[size++] = key;
        upAdjust();
    }

    /***
     * 队列扩容
     */
    public void resize() {
        //队列容量翻倍
        int newSize = this.size * 2;
        this.array = Arrays.copyOf(this.array, newSize);
    }

    /***
     * 出队
     * @return
     * @throws Exception
     */
    public int deQueue() throws Exception {
        if (size <= 0) {
            throw new Exception("the queue is empty");
        }
        // 获取堆顶元素
        int head = array[0];
        // 让最后一个元素移动到堆顶
        array[0] = array[--size];
        downAdjust();
        return head;
    }

    /***
     *  上浮调整
     */
    public void upAdjust() {

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

    /***
     *  下沉调整
     */
    public void downAdjust() {
        // temp保存父节点值 用于最后的赋值
        int parentIndex = 0;
        int temp = array[parentIndex];
        int childIndex = 1;
        while (childIndex < size) {
            // 如果有右孩子，且右孩子小于左孩子的值，则定位到右孩子
            if (childIndex + 1 < size && array[childIndex + 1] < array[childIndex]) {
                childIndex++;
            }
            // 如果父节点小于任何一个孩子的值，则直接跳出
            if (temp >= array[childIndex]) {
                break;
            }
            // 无需真正的交换，单向赋值即可
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = 2 * childIndex + 1;
        }
        array[parentIndex] = temp;
    }


    public static void main(String[] args) throws Exception {
        PriorityQueueOperate priorityQueueOperate = new PriorityQueueOperate();
        priorityQueueOperate.enQueue(3);
        priorityQueueOperate.enQueue(5);
        priorityQueueOperate.enQueue(10);
        priorityQueueOperate.enQueue(2);
        priorityQueueOperate.enQueue(7);
        System.out.println("出队元素 ： " + priorityQueueOperate.deQueue());
        System.out.println("出队元素 ： " + priorityQueueOperate.deQueue());

    }
}
