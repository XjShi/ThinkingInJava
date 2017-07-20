package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by xjshi on 02/03/2017.
 * 18.6.1 缓冲输入文件
 */

/**
 * 打开一个文件用于字符输入
 */
public class BufferedInputFile {
    public static String read(String filename) throws IOException {
        //Reading input by lines
        BufferedReader in = new BufferedReader(new FileReader(filename));

        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null)
            sb.append(s + "\n");

        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        File f = new File(".");
        System.out.println(f.getAbsolutePath());
        System.out.println("-------------");
        System.out.print(read("/Users/xjshi/Java-workspace/ThinkingInJava/src/io/BufferedInputFile.java"));

    }
}
