package io;

import java.io.*;

/**
 * Created by xjshi on 03/03/2017.
 * 18.6.3 格式化的内存输入
 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(
                    BufferedInputFile.read("/Users/xjshi/Java-workspace/ThinkingInJava/src/io/FormattedMemoryInput.java").getBytes()));
                    while (true)
                        System.out.print((char)in.readByte());
        } catch (EOFException e) {
            System.err.println("End of stream");
        }
    }
}
