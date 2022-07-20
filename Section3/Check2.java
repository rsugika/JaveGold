package Section3;

/***
 * Runnableを実現した匿名クラスをThreadのコンストラクタに渡してスレッドを生成する
 */


public class Check2 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("sub");
            }
        });
        t.start();
        System.out.println("main");

        new LambdaThread().main();
    }
    
}


class LambdaThread {
    public static void main() {
        Thread t = new Thread(() -> {
            System.out.println("sub");
        });
        t.start();

        System.out.println("main");
    }
}