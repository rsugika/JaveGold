package Section3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Check8 {
    public static void main(String[] args) throws Exception {
         /***
     * Futureインターフェースによってスレッドを生成したメソッドが、新しく作ったスレッドの結果を知ることができるようになる
     * 結果が分かれば、結果に応じてbつのスレッドを立ち上げたり、処理を継続しているスレッドを止めたりという制御が可能になる
     * 処理結果を受け取るにはget()を呼び出す
     * 
     * @throws InterruptedException
     * @throws ExecutionException
     */
        ExecutorService exec = Executors.newSingleThreadExecutor();
        Future future = exec.submit(() -> {
            try {
                System.out.println("start");
                Thread.sleep(2000);
                System.out.println("end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        if (future.get() == null) {
            System.out.println("Finish");
        }
    }
}
