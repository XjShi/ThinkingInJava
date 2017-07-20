package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by xjshi on 27/06/2017.
 */
public class GetChannel {
    private static final int BSIZE = 1024;
    private static final String filename = "./src/io/data.txt";

    public static void main(String[] args) throws Exception {
        FileChannel fileChannel = new FileOutputStream(filename).getChannel();
        fileChannel.write(ByteBuffer.wrap("Some text ".getBytes()));
        fileChannel.close();

        fileChannel = new RandomAccessFile(filename, "rw").getChannel();
        fileChannel.position(fileChannel.size());
        fileChannel.write(ByteBuffer.wrap("\nSome more".getBytes()));
        fileChannel.close();

        fileChannel = new FileInputStream(filename).getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        fileChannel.read(buffer);
        buffer.flip();
        while (buffer.hasRemaining())
            System.out.print((char)buffer.get());
        fileChannel.close();
    }
}
