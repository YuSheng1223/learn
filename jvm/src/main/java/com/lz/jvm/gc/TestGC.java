package com.lz.jvm.gc;


import org.junit.jupiter.api.Test;

public class TestGC {

    private static final int _1MB = 1024 * 1024;

    /***
     * 对象优先在Eden上分配
     * -verbose:gc -Xms20M -Xmx20M -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8
     */
    @Test
    public void testAllocation() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];
    }

    /***
     * 大对象直接进入老年代
     * -verbose:gc -Xms20M -Xmx20M -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreadhold=3145728
     */
    @Test
    public void testAllocation2(){
        byte[] allocation1;
        allocation1 = new byte[4 * _1MB];
    }

}
