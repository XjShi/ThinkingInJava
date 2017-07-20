package concurrency;

/**
 * Created by xjshi on 16/03/2017.
 */
public class MainThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new LiftOff());
            t.start();
        }
        System.out.println("end");
    }
}
