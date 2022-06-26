package com.lz.jvm.util;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileUtil {


    //byte to file
    public static void byte2File(byte[] bfile, String filePath, String fileName) {
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;
        File file = null;
        try {
            File dir = new File(filePath);
            if (!dir.exists()) {// 判断文件目录是否存在
                dir.mkdirs();
            }
            file = new File(filePath + fileName);
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            bos.write(bfile);
        } catch (Exception e) {

        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e1) {


                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e1) {

                }
            }
        }
    }

    /***
     *  文件转字节数组
     * @param filePath
     * @return
     */
    public static byte[] file2Byte(File filePath) {
        byte[] buffer = null;

        try {
            FileInputStream fis = new FileInputStream(filePath);

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int n;
            while ((n = fis.read(b)) != -1) {
                bos.write(b, 0, n);
            }
            fis.close();
            bos.close();
            buffer = bos.toByteArray();
        } catch (IOException e) {

        }
        return buffer;
    }

    public static void main(String[] args) {
        String classFilePath = "D:\\idea\\learn-space\\jvm\\target\\classes\\com\\lz\\jvm\\TestClass.class";
        byte[] bytes = file2Byte(new File(classFilePath));

    }
}