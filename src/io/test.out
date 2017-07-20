package io;

import java.io.*;

/**
 * Created by xjshi on 03/03/2017.
 * 18.8.3 标准io重定向
 */
public class Redirecting {
    public static void main(String[] args) throws IOException {
        PrintStream console = System.out;
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("/Users/xjshi/Java-workspace/ThinkingInJava/src/io/Redirecting.java"));
        PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("/Users/xjshi/Java-workspace/ThinkingInJava/src/io/test.out")));
        System.setIn(in);
        System.setOut(out);
        System.setErr(out);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null)
            System.out.println(s);
        out.close();
        System.setOut(console);
    }
}
