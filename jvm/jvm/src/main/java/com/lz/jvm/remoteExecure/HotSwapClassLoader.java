package com.lz.jvm.remoteExecure;

/**
 * @author lz
 * @Package com.lz.jvm.remoteExecure
 * @Description: 为了多次载入执行类而加入的加载器
 * 把defineClass方法放开出来，只有外部显式调用的时候才会使用到loadByte方法
 * 由虚拟机调用时，仍然按照原有的双亲委派规则使用loadClass方法进行类加载
 * @date 2022/6/11 16:26
 */
public class HotSwapClassLoader extends ClassLoader {


    public HotSwapClassLoader() {
        super(HotSwapClassLoader.class.getClassLoader());
    }

    public Class loadByte(byte[] classByte) {
        return defineClass(null, classByte, 0, classByte.length);
    }

    public static void main(String[] args) {
        System.out.println(HotSwapClassLoader.class.getClassLoader());
        System.out.println(HotSwapClassLoader.class.getClassLoader().getParent());

        byte[] classBytes = new byte[] {-54,-2,-70,-66,0,0,0,52,0,29,10,0,6,0,15,9,0,16,0,17,8,0,18,10,0,19,0,20,7,0,21,7,0,22,1,0,6,60,105,110,105,116,62,1,0,3,40,41,86,1,0,4,67,111,100,101,1,0,15,76,105,110,101,78,117,109,98,101,114,84,97,98,108,101,1,0,4,109,97,105,110,1,0,22,40,91,76,106,97,118,97,47,108,97,110,103,47,83,116,114,105,110,103,59,41,86,1,0,10,83,111,117,114,99,101,70,105,108,101,1,0,9,77,97,105,110,46,106,97,118,97,12,0,7,0,8,7,0,23,12,0,24,0,25,1,0,11,104,101,108,108,111,32,119,111,114,108,100,7,0,26,12,0,27,0,28,1,0,16,99,111,109,47,115,117,110,116,111,119,110,47,77,97,105,110,1,0,16,106,97,118,97,47,108,97,110,103,47,79,98,106,101,99,116,1,0,16,106,97,118,97,47,108,97,110,103,47,83,121,115,116,101,109,1,0,3,111,117,116,1,0,21,76,106,97,118,97,47,105,111,47,80,114,105,110,116,83,116,114,101,97,109,59,1,0,19,106,97,118,97,47,105,111,47,80,114,105,110,116,83,116,114,101,97,109,1,0,7,112,114,105,110,116,108,110,1,0,21,40,76,106,97,118,97,47,108,97,110,103,47,83,116,114,105,110,103,59,41,86,0,33,0,5,0,6,0,0,0,0,0,2,0,1,0,7,0,8,0,1,0,9,0,0,0,29,0,1,0,1,0,0,0,5,42,-73,0,1,-79,0,0,0,1,0,10,0,0,0,6,0,1,0,0,0,2,0,9,0,11,0,12,0,1,0,9,0,0,0,37,0,2,0,1,0,0,0,9,-78,0,2,18,3,-74,0,4,-79,0,0,0,1,0,10,0,0,0,10,0,2,0,0,0,4,0,8,0,5,0,1,0,13,0,0,0,2,0,14};
        HotSwapClassLoader hotSwapClassLoader = new HotSwapClassLoader();
        Class aClass = hotSwapClassLoader.loadByte(classBytes);
        System.out.println(aClass);
        System.out.println(aClass.getClassLoader());
    }
}
