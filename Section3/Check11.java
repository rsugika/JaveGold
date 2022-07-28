package Section3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/***
 * 別スレッドで発生した例外を受け取る方法について
 * 
 * 次のコードは、発生させた乱数が偶数でなければ例外をスローするようにしている。
 * 例外をスローさせても呼び出し下のスレッドにすぐに例外がスローされるわけではない
 * ここでは、一旦Futureが受け取る
 * 
 * 呼び出したスレッドで例外が発生した場合、Futureのget()はExecutionExceptionをスローする
 * この例外は検査例外であるため例外処理が必要
 * 
 * スレッド内で発生した例外ははExecutionExceptionの内部に保存されているので、getCause()で取り出すことが可能
 * 
 */

public class Check11 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        List<Future<Boolean>> futures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            futures.add(exec.submit(() -> {
                if (new Random().nextInt() % 2 != 0) {
                    throw new Exception("Odd Numbre");
                }
                return true;
            }));
        }

        int total = 0;
        for (Future<Boolean> future : futures) {
            Boolean result = false;
            try {
                result = future.get();
                System.out.println(result);
            } catch (ExecutionException e) {
                System.out.println(e.getMessage());
            }
            if (result) {
                total++;
            }
        }
        System.out.println(total);
    }
}



