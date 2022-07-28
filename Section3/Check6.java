package Section3;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Check6 {
    public static void main(String[] args) {
        
        /***
         * この方法は、処理が始まるときのタイミングを指定しているので、インターバルが一定にならない
         */
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();

        // このメソッドは処理開始のタイミングを指定しておる
        // exec.scheduleAtFixedRate(() -> {
        //     int r = new Random().nextInt(10);
        //     System.out.println(r);
        //     try {
        //         Thread.sleep(r * 100);
        //     } catch (InterruptedException e) {
        //         System.out.println(e.getMessage());
        //     }
        //     System.out.println("interrupt");
        // }, 1, 1, TimeUnit.SECONDS);

        /***
         * 処理時間の長さに関係なく、インターバルを一定にしたいときは
         */

        exec.scheduleWithFixedDelay(() -> {
            int r = new Random().nextInt(10);
            System.out.println(r);
            try {
                Thread.sleep(r * 100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("interrupt");
        }, 1, 1, TimeUnit.SECONDS);

         
    }
}