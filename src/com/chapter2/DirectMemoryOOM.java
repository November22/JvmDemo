package com.chapter2;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author sen.huang
 *         Date: 2018/5/22
 */
public class DirectMemoryOOM {

    private static final int _1MB = 1024*1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field field = Unsafe.class.getDeclaredFields()[0];
        field.setAccessible(true);
        Unsafe o = (Unsafe)field.get(null);
        while (true){
            o.allocateMemory(_1MB);
        }
    }
}
