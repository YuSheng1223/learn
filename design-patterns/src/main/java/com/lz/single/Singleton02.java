package com.lz.single;

/**
 * @author lz
 * @Package com.lz.single
 * @Description: 单例 懒汉
 * @date 2021/11/27 16:38
 */
public class Singleton02 {

    // volatile 保证线程安全 多线程的情况下禁止指令重排序
    private volatile static Singleton02 s;

    private Singleton02() {

    }


    public static Singleton02 getInstance() {
        // 第一次检查 可以理解为提升性能 毕竟只会有一次初始化的机会
        if (s == null) {
            synchronized (Singleton02.class) {
                // 第二次检查 避免有多个线程同时进入 第一次检查的位置
                if (s == null) {
                    s = new Singleton02();
                }
            }
        }

        return s;
    }
}
