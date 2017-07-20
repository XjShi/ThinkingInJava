package io;

import java.io.File;

/**
 * Created by xjshi on 02/03/2017.
 */
public class MakeDirectories {
    private static void usage() {
        System.exit(1);
    }
    private static void fileData(File f) {
        System.out.println("绝对路径: " + f.getAbsolutePath() +
        "\n Can read: " + f.canRead() +
        "\n getName: " + f.getName() +
        "\n getParent: " + f.getParent() +
        "\n getPath: " + f.getPath() +
        "\n length: " + f.length() +
        "\n lastModified: " + f.lastModified());
        if (f.isFile())
            System.out.printf("It's a file.");
        else
            System.out.println("It's a directory.");
    }

    public static void main(String[] args) {

    }
}
