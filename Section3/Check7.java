package Section3;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/***
 * あらかじめ複数のスレッドを生成して保持したnewScheduledThreadPool()を使う
 */


public class Check7 {
    public static void main(String[] args) throws Exception {
        ScheduledExecutorService exec = Executors.newScheduledThreadPool(2);

        exec.scheduleWithFixedDelay(() -> {
            System.out.println("A");
        }, 1, 1, TimeUnit.SECONDS);

        exec.scheduleWithFixedDelay(() -> {
            System.out.println("B");
        }, 1, 1, TimeUnit.SECONDS);

        Thread.sleep(10000);
        exec.shutdown();

    }
}