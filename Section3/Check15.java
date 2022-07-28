package Section3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;


/***
 * AtomicIntegerのaddAndGet()を用いることで、読み出しから値の変更までの一連の処理動作中は
 * 他のスレッドからの処理を受け付けないようにする
 */

class Value {
    private int num = 0;
    public void add(int num) {
        this.num += num;
    }
    public int get() {
        return num;
    }
}

class AtomicValue extends Value {
    private AtomicInteger num = new AtomicInteger();
    public void add(int num) {
        this.num.addAndGet(num);
    }
    public int get() {
        return this.num.intValue();
    }
}

class Task implements Runnable {
    private Value val;
    public Task(Value val) {
        this.val = val;
    }
    @Override
    public void run() {
        this.add(100);
    }
    private void add(int num) {
        this.val.add(num);
    }
}

public class Check15 {
    public static void main(String[] args){
        // Value val = new Value();
        Value val = new AtomicValue();

        ExecutorService exec = Executors.newFixedThreadPool(2);
        exec.submit(new Task(val));
        exec.submit(new Task(val));

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(val.get());
        exec.shutdown();
    }
}