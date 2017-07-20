package io;

import java.io.PrintWriter;

/**
 * Created by xjshi on 03/03/2017.
 * 18.8.2 将System.out转换成PrintWriter
 */
public class ChangeSystemOut {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out, true);
        out.println("Hello, world");
    }
}
