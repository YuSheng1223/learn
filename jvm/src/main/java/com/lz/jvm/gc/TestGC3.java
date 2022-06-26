package com.lz.jvm.gc;


public class TestGC3 {

    public static void main(String[] args) {
        {
            byte[] placeHolder = new byte[64 * 1024 * 1024];
        }
        int a = 0;
        System.gc();
        int y = 0;
        System.out.println(y);
    }
}
