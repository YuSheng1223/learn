package com.lz.single;


/**
 * @author lz
 * @Package com.lz.single
 * @Description: 单例饿汉
 * @date 2021/11/27 16:35
 */
public class Singleton {


    private Singleton() {

    }

    private static Singleton s = new Singleton();


    public static Singleton getInstance() {
        return s;
    }
}
