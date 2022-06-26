package com.lz.jvm.gc;


public class TestGC2 {
    private static final int _1MB = 1024 * 1024;


    public static void main(String[] args) {
        byte[] allocation1;
        allocation1 = new byte[4 * _1MB];
    }
}
