package com.chapter3;

/**
 * @author sen.huang
 *         Date: 2018/6/1
 *        VM Args: -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8
 *        新生代与老年代各10m，其中新生代的Eden区占8m
 */
public class TestAllocation {
    private static final int _1MB = 1024*1024;
    public static void main(String[] args) {
        byte[] a1,a2,a3,a4;

        a1 = new byte[2 * _1MB];
        a2 = new byte[2 * _1MB];
        a3 = new byte[2 * _1MB];
        a4 = new byte[4 * _1MB]; //此处会发生一次Minor GC
    }
}
