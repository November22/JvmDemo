package com.chapter7;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author sen.huang
 *         Date: 2018/6/22
 */
public class ClassloaderTest {
    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
//                System.out.println(name);
                String filename = name.substring(name.lastIndexOf(".")+1)+".class";
                InputStream is = getClass().getResourceAsStream(filename);
                if(is == null){
                    return super.loadClass(name);
                }
                try {
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name,b,0,b.length);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return super.loadClass(name);
            }
        };

        Object obj = classLoader.loadClass("com.chapter7.ClassloaderTest").newInstance();
        System.out.println(obj.getClass());
        System.out.println(obj instanceof ClassloaderTest);
    }
}
