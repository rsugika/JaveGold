package Section3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/***
 * マルチスレッドアプリケーションでは、複数のスレッドで1つのインスタンスを強襲するため、競合が発生する場合がある。
 * つまり、あるスレッドが共有されているインスタンスのフィールド変数が他の別のスレッドに呼び出された値が変更されてしまう可能性がある
 * 下のサンプルコードでは、2/10回で200が表示されるらしい。
 * つまり、排他制御が必要S
 */

public class Check13 implements Runnable {
    private int num = 100;

    public static void main(String[] args) {
            
        Check13 s = new Check13();
        ExecutorService exec = Executors.newFixedThreadPool(2);
        exec.submit(s);
        exec.submit(s);

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(s.num);
        exec.shutdown();
        
        
    }

    // public void add(int amount) {
    //     this.num = this.num + amount;
    // }

    /***
     * synchronizedブロックを使うことで競合を防ぐ
     * 排他制御が実現する
     * @param amount
     */

    public synchronized void add(int amount) {
        this.num = this.num + amount;
    }

    @Override
    public void run() {
        add(100);
    }
}

