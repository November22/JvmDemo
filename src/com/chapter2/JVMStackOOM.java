package com.chapter2;

/**
 * @author sen.huang
 *         Date: 2018/5/22
 */
public class JVMStackOOM {
    private void dontStop(){
        while(true){

        }
    }
    private int i = 0;
    public void stackLeakbyThread(){
        while (true){
            Thread t = new Thread(){
                @Override
                public void run(){
                    i++;
                    System.out.println("threadNo:["+i+"]");
                    dontStop();
                }
            };
            t.start();;
        }
    }

    public static void main(String[] args) {
        JVMStackOOM jvmStackOOM = new JVMStackOOM();
        jvmStackOOM.stackLeakbyThread();
    }
}
