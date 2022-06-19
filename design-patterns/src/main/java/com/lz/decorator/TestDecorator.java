package com.lz.decorator;

import com.lz.decorator.io.LowerCaseInputStream;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;
import org.junit.Test;

import java.io.*;

/**
 * @author lz
 * @Package com.lz.decorator
 * @Description: 测试装饰者
 * @date 2021/8/24 15:21
 */
public class TestDecorator {


    @Test
    public void test() {

        // 需要一杯HouseBlend
        Beverage beverage = new HouseBlend();

        System.out.println("description : " + beverage.getDescription() + " ,花费 ：  " + beverage.cost());
        // 加 mocha
        beverage = new Mocha(beverage);
        // 加 whip
        beverage = new Whip(beverage);

        System.out.println("description : " + beverage.getDescription() + " ,花费 ：  " + beverage.cost());

    }


    @Test
    public void test02() throws Exception {
        // io 中的装饰者
        InputStream inputStream = new FileInputStream("D:\\ceshi.txt");

        inputStream = new LineInputStream(inputStream);

        inputStream = new DataInputStream(inputStream);

        inputStream = new BufferedInputStream(inputStream);

        byte[] buf = new byte[1024];

        int length = 0;

        while ((length = inputStream.read(buf)) >= 0) {
            System.out.println(new String(buf, 0, length));
        }

        inputStream.close();

    }

    @Test
    public void test03() throws Exception {
        // 测试自己实现的IO装饰者
        int c;
        try {
            InputStream inputStream = new FileInputStream("D:\\ceshi.txt");

            inputStream = new BufferedInputStream(inputStream);

            inputStream = new LowerCaseInputStream(inputStream);

            inputStream = new LineInputStream(inputStream);

            while ((c = inputStream.read()) >= 0) {
                System.out.print((char) c);
            }

            inputStream.close();
        } catch (IOException e) {

            e.printStackTrace();

        }


    }


}
