package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * Created by xjshi on 27/06/2017.
 */
public class BufferToText {
    private static final int BSIZE = 1024;
    private static final String FILENAME = "./src/io/data.txt";

    public static void main(String[] args) throws IOException {
        FileChannel fileChannel = new FileOutputStream(FILENAME).getChannel();
        fileChannel.write(ByteBuffer.wrap("some text".getBytes()));
        fileChannel.close();

        fileChannel = new FileInputStream(FILENAME).getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        fileChannel.read(buffer);
        buffer.flip();
        System.out.println(buffer.asCharBuffer());
        //Decode using this system's default Charset.
        buffer.rewind();
        String encoding = System.getProperty("file.encoding");
        System.out.println("Decoded using " + encoding + ": " + Charset.forName(encoding).decode(buffer));

        //or, we could encode with something that will print
        fileChannel = new FileOutputStream(FILENAME).getChannel();
        fileChannel.write(ByteBuffer.wrap("some text1".getBytes("UTF-16BE")));
        fileChannel.close();
        //now try reading again
        fileChannel = new FileInputStream(FILENAME).getChannel();
        buffer.clear();
        fileChannel.read(buffer);
        buffer.flip();
        System.out.println(buffer.asCharBuffer());

        //Use a CharBuff to write through
        fileChannel = new FileOutputStream(FILENAME).getChannel();
        buffer = ByteBuffer.allocate(28);
        buffer.asCharBuffer().put("some text 2");
        fileChannel.write(buffer);
        fileChannel.close();
        //
        fileChannel = new FileInputStream(FILENAME).getChannel();
        buffer.clear();
        fileChannel.read(buffer);
        buffer.flip();
        System.out.println(buffer.asCharBuffer());
    }
}
