package com.lz.jvm.remoteExecute;


import java.io.File;

import static com.lz.jvm.util.FileUtil.file2Byte;

/***
 * 为了多次载入执行类而加入的类加载器
 * 把defineClass方法
 */
public class HotSwapClassLoader extends ClassLoader {

    public HotSwapClassLoader() {
        super(HotSwapClassLoader.class.getClassLoader());
    }

    public Class loadByte(byte[] classByte) {
        return defineClass(null, classByte, 0, classByte.length);
    }

    public static void main(String[] args) {
        String classFilePath = "D:\\idea\\learn-space\\jvm\\target\\classes\\com\\lz\\jvm\\TestClass.class";
        byte[] bytes = file2Byte(new File(classFilePath));
        HotSwapClassLoader hotSwapClassLoader = new HotSwapClassLoader();
        Class aClass = hotSwapClassLoader.loadByte(bytes);
        System.out.println(aClass);
        System.out.println(aClass.getClassLoader());
        System.out.println(hotSwapClassLoader.getClass().getClassLoader());
    }
}
