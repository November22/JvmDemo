package com.chapter3;

/**
 * @author sen.huang
 *         Date: 2018/6/1
 */
public class TestAllocation4 {

    private static final int _1MB = 1024*1024;

    public static void main(String[] args) {
        byte[] a1,a2,a3,a4,a5,a6;
        a1 = new byte[3*_1MB];
        a2 = new byte[3*_1MB];//1.GC
        a3 = new byte[3*_1MB];//2.GC
        a4 = new byte[3*_1MB];//Full GC
        a5 = new byte[3*_1MB];//Full GC
        a6 = new byte[3*_1MB];
    }
}
