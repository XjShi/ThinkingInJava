package concurrency;

import java.util.concurrent.ThreadFactory;

/**
 * Created by xjshi on 17/03/2017.
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
