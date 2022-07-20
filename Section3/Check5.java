package Section3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Check5 {
    public static void main(String[] args) throws Exception{
        new Sample6().main();
    }
}

/***
 * インターバル時間を設定して処理を行う
 */

class Sample6 {
    public static void main() throws Exception{
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();

        exec.scheduleAtFixedRate(() -> {
            System.out.println("interrupt");
        }, 1, 1, TimeUnit.SECONDS);

        int count = 0;
        while(true) {
            Thread.sleep(100);
            System.out.println(">");
            count++;
            if(count == 100) {
                exec.shutdown();
                break;
            }
        }
    }
}

