package com.lz.decorator.io;

import java.io.*;

/**
 * @author lz
 * @Package com.lz.decorator.io
 * @Description: 实现一个IO装饰者 将输入流中的大写字母转换成小写字母
 * @date 2021/8/28 15:03
 */
public class LowerCaseInputStream extends FilterInputStream {


    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase(c));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);

        for (int i = off; i < off + result; i++) {

            b[i] = (byte) Character.toLowerCase(b[i]);

        }
        return result;
    }
}
