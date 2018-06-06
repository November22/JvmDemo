package com.chapter4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sen.huang
 *         Date: 2018/6/6
 */
public class TestJconsole1 {
    static class OOMObject{
        public byte[] placeholder = new byte[64*1024];
    }

    public static void main(String[] args)throws Exception {
        fillHeap(10000);
    }

    public static void fillHeap(int num) throws Exception{
        List<OOMObject> list = new ArrayList<>();
        for (int i=0;i<num;i++){
            Thread.sleep(50);
            list.add(new OOMObject());
        }
        System.gc();
    }
}


