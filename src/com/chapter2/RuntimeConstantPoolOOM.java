package com.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sen.huang
 *         Date: 2018/5/22
 * 1.6 会出错 java.lang.OutOfMemory:PermGen space
 * 1.7不会
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        int i=0;
        List<String> list = new ArrayList<>();
        while (true){
            list.add(String.valueOf(i++).intern());
        }
    }
}
