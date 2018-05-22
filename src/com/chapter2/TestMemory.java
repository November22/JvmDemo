package com.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sen.huang
 *         Date: 2018/5/21
 */
public class TestMemory {
    static class OOMObject{

    }
    private int stackLen = 1;
    private void stackLeak(){
        System.out.println("==============="+stackLen);
        stackLen++;
        stackLeak();
    }

    public static void main(String[] args) {
//        testOOM();//测试堆内存溢出
        //测试栈溢出
        TestMemory testMemory = new TestMemory();
        try {
            testMemory.stackLeak();
        } catch (Exception e) {

            throw e;
        }
    }

    /**
     * 测试堆内存溢出
     * java.lang.OutOfMemoryError: Java heap space
     * 对这个区域的异常，一般手段是先通过内存映像分析工具对Dump出来的 堆存储快照进行分析，
     * 重点确认内存中的对象是否是必要的。也就是要分清是 内存泄漏（Memory Leak）还是内存溢出（Memory Overflow）
     *
     * 被称为 GC(Garbage Collector) Roots 实际上是垃圾回收器需要回收的对象。
     * 垃圾回收器回收那些不是 GC Roots 的对象并且不再被GC Roots引用的对象。
     */
    private static void testOOM(){
        List<OOMObject> list = new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }
    }

}
