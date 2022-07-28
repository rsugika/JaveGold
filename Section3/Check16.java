package Section3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.sql.RowSetInternal;

/***
 * マルチアプリケーションで利用されるクラスは、スレッドセーフである必要がある
 * スレッドセーフとは、正しく排他制御され、複数のスレッドから同時に利用されて
 * 競合やデットロック、ライブロックと行った問題が起きないクラス
 * 
 * ArrayListクラスはスレッドセーフではない
 * 
 * その代わりにCopyOnWriteArrayListクラスを用いる
 */

public class Check16 {
    public static void main(String[] args){
        // ArrayListを用いるとエラーが出る
        // スレッドセーフでないから
        // ArrayList<Integer> list = new ArrayList<Integer>();

        // その代わりにCopyOnWriteArrayListクラスを用いる
        List<Integer> list = new CopyOnWriteArrayList<Integer>();
        
        list.add(1);
        list.add(2);
        list.add(3);

        ExecutorService exec = Executors.newFixedThreadPool(2);
        exec.submit(new WriteTask(list));
        exec.submit(new ReadTask(list));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        exec.shutdown();
    }
}


/***
 * リストの要素の読み込みを行うReadTaskクラス
 */

class ReadTask implements Runnable {
    private List<Integer> list;

    public ReadTask(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        try {
            for (Integer i : list) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/***
 * リストに要素を追加するWriteTaskクラス
 */

 class WriteTask implements Runnable {
    private List<Integer> list;

    public WriteTask(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 10; i < 20; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list.add(i);
        }
    }
 }