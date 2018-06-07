package com.chapter4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author sen.huang
 *         Date: 2018/6/7
 */

/* BTrace Script Template */
//import com.sun.btrace.annotations.*;
//import static com.sun.btrace.BTraceUtils.*;
//
//@BTrace
//public class TracingScript {
//    /* put your code here */
//    @OnMethod(
//            clazz="com.chapter4.BtraceTest",
//            method="add",
//            location=@Location(Kind.RETURN)
//    )
//    public static void func(@Self com.chapter4.BtraceTest instace,int a,int b,@Return int result ){
//        println("======");
//        jstack();
//        println(strcat("a:",str(a)));
//        println(strcat("b",str(b)));
//        println(strcat("r",str(result)));
//    }
//}
public class BtraceTest {
    public int add(int i,int j){
        return i+j;
    }

    public static void main(String[] args) throws Exception{
        BtraceTest btraceTest = new BtraceTest();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++){
            reader.readLine();
            int a = (int)Math.round(Math.random()*1000);
            int b = (int)Math.round(Math.random()*1000);
            btraceTest.add(a,b);
        }
    }
}
