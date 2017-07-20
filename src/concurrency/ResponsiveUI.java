package concurrency;

/**
 * Created by xjshi on 17/03/2017.
 */
public class ResponsiveUI extends Thread {
    private static volatile double d = 1;

    public ResponsiveUI() {
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while (true)
            d = d + (Math.PI + Math.E) / d;
    }

    public static void main(String[] args) throws Exception {
//        new UnresponsivveUI();
        new ResponsiveUI();
        System.in.read();
        System.out.println(d);
    }
}

class UnresponsivveUI {
    private volatile double d = 1;

    public UnresponsivveUI() throws Exception {
        while (d > 0)
            d = d + (Math.PI + Math.E) / d;
        System.in.read();
    }
}