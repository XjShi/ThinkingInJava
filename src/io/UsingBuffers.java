package io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

import static net.mindview.util.Print.print;

/**
 * Created by xjshi on 27/06/2017.
 */
public class UsingBuffers {
    private static void symmetricScramble(CharBuffer buffer) {
        while (buffer.hasRemaining()) {
            buffer.mark();      //  Sets this buffer's mark at its position.
            char c1 = buffer.get();
            char c2 = buffer.get();
            buffer.reset();     //  Resets this buffer's position to the previously-marked position.
            buffer.put(c2).put(c1);
        }
    }

    public static void main(String[] args) {
        char[] data = "UsingBuffers".toCharArray();
        ByteBuffer buffer = ByteBuffer.allocate(data.length * 2);
        CharBuffer charBuffer = buffer.asCharBuffer();
        charBuffer.put(data);

        print(charBuffer.rewind());

        symmetricScramble(charBuffer);
        print(charBuffer.rewind());

        symmetricScramble(charBuffer);
        print(charBuffer.rewind());
    }
}
