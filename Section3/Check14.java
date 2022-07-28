package Section3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/***
 * デットロックを回避するには、ロックする順番をスレッド間で揃える方法がある。
 * ライブロックは、デットロックとにた結果になる。デットロックを避けるために2つのスレッドが譲り合いをしている状態
 */

public class Check14 {

    /***
     * デットロックを起こすメソッド
     * 具体的には↓
     * 1つ目のタスクがaをロックした状態で、bにアクセスしようとしているが2つ目のタスクがbをロックしている
     * 2つ目のタスクがaにアクセスしようとしているが、1つ目のタスクがaをロックしている
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        BankAccount a = new BankAccount(100);
        BankAccount b = new BankAccount(100);

        ExecutorService exec = Executors.newFixedThreadPool(2);

        /***
         * synchronizedブロックを使って変数aで参照できるインスタンスのロックを取得してから出金し、
         * 変数bで参照できるインスタンスのロックを取得して入金している
         */
        exec.submit(() -> {
            synchronized (a) {
                a.withdrawals(20);
                synchronized (b) {
                    b.deposit(20);
                }
            }
        });

        /***
         * こちらは、逆に変数bで参照できるインスタンスのロックを取得してから出金し、
         * 変数aで参照できるインスタンスのロックを取得して入金しようとしている。
         */
        exec.submit(() -> {
            synchronized (b) {
                b.withdrawals(30);
                synchronized (a) {
                    a.deposit(30);
                }
            }
        });
    }

}







class BankAccount {
    private int balance;
    /**
     * 
     * @param balance
     */
    public BankAccount(int balance) {
        this.balance = balance;
    }

    /***
     * 
     * @param amount
     */
    public void deposit(int amount) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.balance += amount;
    }

    /***
     * 
     * @param amount
     */
    public void withdrawals(int amount) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.balance -= balance;
    }

    public int getBalance() {
        return balance;
    }

}