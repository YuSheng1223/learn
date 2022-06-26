package com.lz.algorithm.list;


public class LinkedListOperate {


    /***
     * 头结点
     */
    private Node head;

    private Node last;

    private int size;

    /***
     *  插入一个节点
     * @param data
     * @param index
     */
    public void insert(int data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        Node insertNode = new Node(data);

        if (size == 0) {
            head = insertNode;
            last = insertNode;
        } else if (index == 0) {
            insertNode.next = head;
            head = insertNode;
        } else if (size == index) {
            last.next = insertNode;
            last = insertNode;
        } else {
            Node prevNode = get(index - 1);
            insertNode.next = prevNode.next;
            prevNode.next = insertNode;
        }
        size++;
    }

    /***
     * 移除某个节点
     * @param index
     * @return
     */
    public Node remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        Node removeNode = null;
        if (index == 0) {
            removeNode = head;
            head = head.next;
        } else if (index == size - 1) {
            Node prevNode = get(index - 1);
            removeNode = prevNode.next;
            prevNode.next = null;
            last = prevNode;
        } else {
            Node prevNode = get(index - 1);
            removeNode = prevNode.next;
            prevNode.next = prevNode.next.next;
        }

        size--;
        return removeNode;
    }


    /***
     * 获取索引位置节点
     * @param index
     * @return
     */
    private Node get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

}
