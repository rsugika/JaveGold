package Section3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Check4 {
     public static void main(String[] args) throws Exception {
        new Sample5().main();
     }
}

/***
 * 処理するタイミングを管理したいときは、ScheduledExecutorService()
 * を使う。なお、遅延実行はschedule()を呼び出して使う
 */

class Sample5 {
    public static void main() throws Exception {
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        exec.schedule(() -> {
            System.out.println("finish");
            exec.shutdown(); // スレッドプールを閉じる
        }, 1, TimeUnit.SECONDS);

        int count = 0;
        while (true) {
            Thread.sleep(100);
            if (exec.isShutdown()) {
                break;
            }
            System.out.println((++count) * 100 + " ms");
        }
    }
}