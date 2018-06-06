package com.chapter4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author sen.huang
 *         Date: 2018/6/6
 */
public class TestJconsole2 {

    public static void createBusyThread(){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                    try {
                        //TIMED_WAITING
                        Thread.sleep(5*6*1000);
                        System.out.println("createBusyThread over");
                        return;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

            }
        },"testBusyThread");
        t.start();
    }

    public static void createLockThread(final Object obj,String name){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj){
                    try {
                        //WAITING
                        System.out.println(name);
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },name);
        t.start();
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        createBusyThread();
        br.readLine();
        final Object obj = new Object();
        createLockThread(obj,"lockThread1");
        createLockThread(obj,"lockThread2");
        //BLOCKED,表明你需要获得锁，来执行自己的任务
    }
}
