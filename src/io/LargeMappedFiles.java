package io;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * Created by xjshi on 27/06/2017.
 */
public class LargeMappedFiles {
    static int length = 0x8FFFFFF;  //  128M
    private static final String FILENAME = "./src/io/test.dat";

    public static void main(String[] args) throws IOException {
        MappedByteBuffer out = new RandomAccessFile(FILENAME, "rw").getChannel()
                .map(FileChannel.MapMode.READ_WRITE, 0, length);
        for (int i = 0; i < length; i++) {
            out.put((byte)'x');
        }
        print("Finished writing");
        for (int i = length/2; i < length/2 + 6; i++) {
            printnb((char)out.get(i));
        }
    }
}
