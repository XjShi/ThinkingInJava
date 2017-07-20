package io;

import java.io.*;

/**
 * Created by xjshi on 03/03/2017.
 * 18.6.4 基本的文件输出
 */
public class BasicFileOutput {
    static String file = "/Users/xjshi/Java-workspace/ThinkingInJava/src/io/BufferedInputFile.out";
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("/Users/xjshi/Java-workspace/ThinkingInJava/src/io/BufferedInputFile.java")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        int lineCount = 1;
        String s;
        while((s = in.readLine()) != null)
            out.println(lineCount++ + ":" + s);
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
