package Section3;

public class Check1 {
    public static void main(String[] args) {
        new Main().main();
        new Sample().main();
    }
}

/***
 * javaのマルチスレッド・プログラミンギに関する問題
 * つまり、並列処理。複数の処理を同時に実行することができる
 * CPUのコアの数だけ、マルチタスクを行える
 * 
 * javaではメソッドの呼び出し順を管理するためにスタック領域を使用する
 * 
 * 新しいThreadを作るには.start()を呼び出す必要がある・
 */

class Main {
    public static void main() {
        Thread t = new Thread() {
            @Override
            public synchronized void start() {
                super.start();
                System.out.println("A");
            }
            @Override
            public void run() {
                super.run();
                System.out.println("B");
            }
        };
        t.run();
    }
}

/***
 *  新しいスレッドのクラスSampleThread
 * 新しいThreadを作るには.start()を呼び出す必要がある
 */

 class SampleThred extends Thread {
    @Override
    public void run() {
        System.out.println("sub");
    }
 }

 class Sample {
    public static void main() {
        Thread t = new SampleThred();
        t.start();

        System.out.println("main");
    }
 }