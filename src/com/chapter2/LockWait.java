package com.chapter2;

/**
 * @author sen.huang
 * @date 2018/5/27.
 */
public class LockWait {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run(){
                try {
                    Thread.sleep(123123123123L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }
}
