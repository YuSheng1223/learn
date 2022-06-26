package com.lz.algorithm.queue;

/***
 * 循数组实现的环队列  FIFO
 * 队列是否已经满的条件 (队尾下标+1)%数组长度 = 队头下标
 */
public class CycleQueue {

    private int[] array;
    private int front;
    private int rear;

    public CycleQueue(int capacity) {
        this.array = new int[capacity];
    }

    /***
     *  入队 时间复杂度 O(1)
     * @param element
     * @throws Exception
     */
    public void enQueue(int element) throws Exception {
        if ((rear + 1) % array.length == front) {
            throw new Exception("队列已满");
        }
        array[rear] = element;
        rear = (rear + 1) % array.length;
    }

    /***
     * 出队 时间复杂度 O(1)
     * @return
     * @throws Exception
     */
    public int deQueue() throws Exception {
        if (rear == front) {
            throw new Exception("队列已空");
        }
        int deQueueElement = array[front];
        front = (front + 1) % array.length;
        return deQueueElement;
    }

    /***
     * 输出
     */
    public void output() {
        for (int i = front; i != rear; i = (i + 1) % array.length) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) throws Exception {

        //    System.out.println((5 + 1) % 8);
        CycleQueue cycleQueue = new CycleQueue(6);
        cycleQueue.enQueue(3);
        cycleQueue.enQueue(5);
        cycleQueue.enQueue(6);
        cycleQueue.enQueue(8);
        cycleQueue.enQueue(1);
        System.out.println(cycleQueue.deQueue());
        System.out.println(cycleQueue.deQueue());
        System.out.println(cycleQueue.deQueue());
        cycleQueue.enQueue(100);
        cycleQueue.enQueue(200);
        cycleQueue.enQueue(300);
        cycleQueue.output();
    }
}
