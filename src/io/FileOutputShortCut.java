package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

/**
 * Created by xjshi on 03/03/2017.
 * 18.6.4 文本文件输出的快捷方式
 */
public class FileOutputShortCut {
    static String file = "/Users/xjshi/Java-workspace/ThinkingInJava/src/io/FileOutputShortCut.out";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("/Users/xjshi/Java-workspace/ThinkingInJava/src/io/FileOutputShortCut.java")));

        PrintWriter out = new PrintWriter(file);
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null)
            out.println(lineCount++ + ": " + s);
        out.close();

        System.out.println(BufferedInputFile.read(file));
    }
}
