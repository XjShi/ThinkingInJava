package io;

import java.io.*;

/**
 * Created by xjshi on 27/06/2017.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        String filename = "./src/io/data.txt";
        File file = new File(filename);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder stringBuilder = new StringBuilder();
        while ((s = bufferedReader.readLine()) != null) {
            stringBuilder.append(s);
        }
        bufferedReader.close();
        System.out.println(stringBuilder);
    }
}
