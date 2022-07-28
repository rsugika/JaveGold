package Section3;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/***
 * 複数スレッドの同期化処理
 * - 同期化処理とは、複数のスレッドが並行して実行されているときに、処理の順番を制御すること
 * - CyclicBarrierは、複数のスレッドが特定のポイントまで到達するのを待機できるようにする同期化支援機能を提供するクラス
 * 複数スレッドが待ち合わせる待機ポイントのことを"バリアー"と呼ぶ
 * このバリアーに全てのバリアーに全てのスレッドが到達すると"バリアーアクション"と呼ばれる処理を実行するのがこのクラスの役割
 * 
 * 例 : CyclicBarrier barrier = new CyclicBarrier(3, new BarrierAction());
 */

public class Check12 {

    /***
     * CyclicBarrierのインスタンス化とバリアーアクションをテイフィしているのがSampleクラス
     * ここでは、5つのスレッドを同期かするCyclicBarrierのインスタンスを生成している
     * このときバリアーアクションとしてコンソールに"it's all done"を表示する
     * @param args
     */

    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(5);

        CyclicBarrier barrier = new CyclicBarrier(5, () -> {
            System.out.println("It's all done");
        });
        for (int i = 0; i < 5; i++) {
            exec.submit(new Task(barrier));
        }
    }
}

// CyclicBarrierクラスのawaitメソッドを呼び出し処理を中断する
// ワーカースレッドの中断がコンストラクタで設定したスレッド数に達すると、CyclicBarrierインスタンスはバリアーリアクション
// スレッドで実行する処理を記述しているrun()では

class Task implements Runnable {
    private CyclicBarrier barrier;

    public Task(CyclicBarrier barrier) {
        super();
        this.barrier = barrier;
    }
    
    @Override
    public void run() {
        long id = Thread.currentThread().getId();
        System.out.println("START : " + id);

        int r = new Random().nextInt(10);
        try {
            Thread.sleep(r * 100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("END : " + id);
        try {
            this.barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        } 
    }
}
