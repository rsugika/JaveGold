package Section3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/***
 * 戻り値を戻せないRunnable型のタスクを使った場合、Futureインターフェースのget()はnullを戻す
 * null以外の値を戻したい場合には、オーバーロードされたsubmit()の第２引数に戻り値を指定する
 * 戻り値の型はFutureの型パラメータによって決まる
 */

public class Check9 {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        Future<String> future = exec.submit(() -> {
            try {
                System.out.println("start");
                Thread.sleep(2000);
                System.out.println("end");
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }, "Finish");

        String result = future.get();
        System.out.println(result);
    }
}