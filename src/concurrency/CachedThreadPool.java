package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xjshi on 16/03/2017.
 */
public class CachedThreadPool {
    public static void main(String[] args) {
//        ExecutorService exec = Executors.newCachedThreadPool();
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff(10));
        }
        exec.shutdown();
    }
}
