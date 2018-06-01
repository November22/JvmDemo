package com.chapter3;

/**
 * @author sen.huang
 *         Date: 2018/6/1
 *         -Xms20m
-Xmx20m
-Xmn10m
-XX:+PrintGCDetails
-XX:SurvivorRatio=8
-XX:+UseSerialGC
-XX:MaxTenuringThreshold=1和15
-XX:+PrintTenuringDistribution
 */
public class TestAllocation3 {

    private static final int _1MB = 1024*1024;

    public static void main(String[] args) {
        byte[] a1,a2,a3,a4;
        a1 = new byte[_1MB/4];
        a2 = new byte[4 * _1MB];
        a3 = new byte[4 * _1MB];
//        a3 = null;
        a4 = new byte[4 * _1MB];
    }
}
