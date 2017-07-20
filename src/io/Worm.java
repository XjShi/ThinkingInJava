package io;

import java.io.Serializable;
import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * Created by xjshi on 27/06/2017.
 */
class Data implements Serializable {
    private int i;

    public Data(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}

public class Worm {
    private static Random rand = new Random(47);
    private Data[] d = {
            new Data(rand.nextInt(10)),
            new Data(rand.nextInt(10)),
            new Data(rand.nextInt(10))
    };
    private Worm next;
    private char c;

    public Worm(int i, char c) {
        print("Worm constructor: " + i);
        this.c = c;
        if (--i > 0)
            next = new Worm(i, (char) (c + 1));
    }

    public Worm() {
        print("Default constructor");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(":");
        result.append(c);
        result.append("(");
        for (Data dat :
                d) {
            result.append(")");
        }
        if (next != null)
            result.append(next);
        return result.toString();
    }
}
