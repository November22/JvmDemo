package com.chapter3;

/**
 * @author sen.huang
 *         Date: 2018/6/1
 */
public class TestAllocation2 {
    private static final int _1MB = 1024*1024;

    public static void main(String[] args) {
        byte[] a = new byte[4*_1MB];
    }
}
