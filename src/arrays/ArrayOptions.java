package arrays;

import java.util.Arrays;

import static net.mindview.util.Print.print;

/**
 * Created by xjshi on 03/06/2017.
 */
public class ArrayOptions {
    public static void main(String[] args) {
        BerylliumSphere[] a;
        BerylliumSphere[] b = new BerylliumSphere[5];
        print("b: " + Arrays.toString(b));

        BerylliumSphere[] c = new BerylliumSphere[4];
        for (int i = 0; i < c.length; i++) {
            if (c[i] == null)
                c[i] = new BerylliumSphere();
        }

        BerylliumSphere[] d = {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};

        a = new BerylliumSphere[]{
                new BerylliumSphere(), new BerylliumSphere()
        };

        print("a.length: " + a.length);
        print("b.length: " + b.length);
        print("c.length: " + c.length);
        print("d.length: " + d.length);

        a = d;
        print("a.length: " + a.length);


        //  Arrays of primitives
        int[] e;
        int[] f = new int[5];
        print("f: " + Arrays.toString(f));
        int[] g = new int[4];
        for (int i = 0; i < g.length; i++) {
            g[i] = i*i;
        }
        int[] h = {11, 47, 93};
        e = h;
        e = new int[]{1, 32};

    }
}
