package io;

import java.nio.ByteBuffer;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * Created by xjshi on 27/06/2017.
 */
public class GetData {
    private static final int BSIZE = 1024;
    private static final String FILENAME = "./src/io/data.txt";

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        int i = 0;
        while (i++ < buffer.limit()) {
            if (buffer.get() != 0)
                print("nonzero");
        }
        print("i = " + i);

        buffer.rewind();
        buffer.asCharBuffer().put("Howdy!");
        char c;
        while ((c = buffer.getChar()) != 0)
            printnb(c + " ");
        print();

        buffer.rewind();
        buffer.asShortBuffer().put((short)461142);
        print(buffer.getShort());

        buffer.rewind();
        buffer.asIntBuffer().put(99471142);
        print(buffer.getInt());

        buffer.rewind();
        buffer.asLongBuffer().put(99471142);
        print(buffer.getLong());

        buffer.rewind();
    }
}
