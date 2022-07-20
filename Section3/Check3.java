package Section3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Check3 {

    public static void main(String[] args) throws InterruptedException {
        new Sample1().main();
        new Sample2().main();
        new Sample3().main();
    }    
}

/***
 * newSingleTreadExecutorメソッドをつかてt、一つだけスレッドを確保し
 * それを使い回しているので、同じスレッドIDが並ぶ
 */

class Sample1 {
    public static void main() {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            exec.submit(() -> {
                System.out.println(Thread.currentThread().getId());
            });
        }
    }
}

/***
 * あらかじめ決まった数のスレッドを生成し、スレッドプールに貯めて使い回すこともできる
 * newFixedThreadPool()は生成したいスレッド数を引数に受けとり、生成した分だけのタスク待ちのスレッドを保持する
 * スレッドプールを作る。これは固定長
 */

class Sample2 {
    public static void main() {
        ExecutorService exec = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            exec.submit(() -> {
                System.out.println(Thread.currentThread().getId());
            });
        }
    }
}

/***
 * 必要に応じてスレッドを増減させるスレッドプールを生成するには
 * newCachedThreadPool()を使用する
 * 一度生成されたスレッドは60秒使用されなければ破棄される
 * 
 * 下のコードでは、10秒しか経過していない部分は、スレッドが使いまわされる
 * その後は新しいスレッドが生成される
 */

class Sample3 {
    public static void main() throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();

        Runnable test = () -> {
            System.out.println(Thread.currentThread().getId());
        };
    
        for (int i = 0; i < 5; i++) {
            exec.submit(test);
        }

        Thread.sleep(1 * 10000);
        System.out.println("--------10 sec later --------");
        for (int i = 0; i < 5; i++) {
            exec.submit(test);
        }
        Thread.sleep(1 * 70000);
        System.out.println("----------70 sec later---------");

        for(int i = 0; i < 5; i++) {
            exec.submit(test);
        }
    }
}
