package Section3;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/***
 * synchronizedによる排他制御やatomicパッケージに属するクラスを利用した原子性の担保では
 * 複数のメソッドにまたがるような排他制御を実現できない
 */

class Test {

    private final ReentrantLock lock = new ReentrantLock();

    public void lock() {
        this.lock.lock();
    }

    public void unlock() {
        this.lock.unlock();
    }



    public void first() {
        System.out.println(Thread.currentThread().getId() + ":1");
    }
    public void second() {
        System.out.println(Thread.currentThread().getId() + ":2");
    }
    public void third() {
        System.out.println(Thread.currentThread().getId() + ":3");
    }
}


/*** 
 * ロックと解除までの処理はtryブロックで囲み、解除はfinallyブロックに記述する
 * いずれかのスレッドに何らかの例外が発生してもロックは解除されるため、別のスレッドが処理を続行できる
 */
class Task implements Runnable {
    private Test test;

    public Task(Test test) {
        super();
        this.test = test;
    }
    @Override
    public void run() {
        
        // test.first();
        // test.second();
        // test.third();

        try {
            test.lock();
            test.first();
            test.second();
            test.third();
        } finally {
            test.unlock();
        }
    }
}

public class Check17 {
    public static void main(String[] args) {
        Test t = new Test();

        ExecutorService exec = Executors.newFixedThreadPool(3);
        exec.submit(new Task(t));
        exec.submit(new Task(t));
        exec.submit(new Task(t));
    }
}