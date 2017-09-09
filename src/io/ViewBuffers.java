package io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.FloatBuffer;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * Created by xjshi on 25/08/2017.
 */
public class ViewBuffers {
    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, 0, 0, 0, 'a'});
        bb.rewind();
        printnb("Byte Buffer ");

        while (bb.hasRemaining())
            printnb(bb.position() + " -> " + bb.get() + ", ");;
        print();

        CharBuffer cb = ((ByteBuffer)bb.rewind()).asCharBuffer();
        printnb("Char Buffer ");
        while (cb.hasRemaining())
            printnb(cb.position() + " -> " + cb.get() + ", ");
        print();

        FloatBuffer fb = ((ByteBuffer)bb.rewind()).asFloatBuffer();
        printnb("Float Buffer ");
        while (fb.hasRemaining())
            printnb(fb.position() + " -> " + fb.get() + ", ");
    }
}
