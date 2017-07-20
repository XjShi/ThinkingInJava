package concurrency;

import static net.mindview.util.Print.print;

/**
 * Created by xjshi on 28/06/2017.
 */
public class MultiLock {
    public synchronized void f1(int count) {
        if (count-- > 0) {
            print("f1() calling f2() with count " + count);
            f2(count);
        }
    }
    public synchronized void f2(int count) {
        if (count-- > 0) {
            print("f2() calling f1() with count " + count);
            f1(count);
        }
    }

    public static void main(String[] args) {
        final MultiLock multiLock = new MultiLock();
        new Thread() {
            @Override
            public void run() {
                multiLock.f1(10);
            }
        }.start();
    }
}
