package com.lz.algorithm.complexity;


public class SpaceComplexity {

    /***
     * 算法的存储空间大小和输入规模没有直接关系 O(1)
     * @param n
     */
    public void fun1(int n) {
        int i = 3;
    }

    /***
     *  当算法分配的空间是一个线性的集合(如数组) ，并且集合的大小和输入规模n成正比 O(n)
     * @param n
     */
    public void fun2(int n) {
        int[] array = new int[n];
    }

    /***
     * 当算法分配的空间是一个二维数组集合，并且集合的长度和宽度都与输入规模n成正比时 O(n^2)
     * @param n
     */
    public void fun3(int n) {
        int[][] array = new int[n][n];
    }


}
