package io;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by xjshi on 03/03/2017.
 * 18.6.2 从内存输入
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(BufferedInputFile.read("/Users/xjshi/Java-workspace/ThinkingInJava/src/io/MemoryInput.java"));
        int c;
        while ((c = in.read()) != -1)
            System.out.print((char)c);
    }
}
