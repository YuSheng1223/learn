package com.lz.algorithm.complexity;

/***
 * 时间复杂度
 */
public class TimeComplexity {

    /***
     * T(n) = 3n; 执行次数是线性的   o(n)
     * @param n 输入规模
     */
    public void eat1(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("-----");
        }
    }

    /***
     *T(n) = 5logn 执行次数是用对数计算的 O(logn)
     */
    public void eat2(int n) {
        for (int i = n; i > 1; i /= 2) {
            System.out.println("-------");
            System.out.println("-------");
            System.out.println("-------");
            System.out.println("-------");
            System.out.println("-------");
        }
    }

    /***
     * T(n) = 2 执行次数是常数     O(1)
     */
    public void eat3() {
        System.out.println("------");
        System.out.println("------");
    }

    /***
     * T(n) = n^2 + n 执行次数是用多项式计算的 O(n^2)
     * @param n
     */
    public void eat4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("-------");
            }
            System.out.println("-------");
        }
    }

}
