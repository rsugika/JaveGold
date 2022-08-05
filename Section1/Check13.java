package Section1;

public class Check13 {
    
}

/***
 * スーパークラスのメソッドが優先的に呼び出されるとき。
 * Class Sampleでは、Bを継承し、Aを実装している。
 * サブクラスはスーパークラスに置き換え可能でなけらばならないという「リスコフの置換原則」を守るため
 * class B内のtestメソッドがprotectedだと、Sampleクラス内でこの原則が破られる。
 * オーバーライドするときは、アクセス制限を同等か広く取る必要がある
 */

interface A13 {
    public default void test() {
        System.out.println("A");
    }
}

abstract class B13 {
    // ここがpublicであればコンパイルエラーは起きない
    // protected void test() {
    public void test() {
        System.out.println("B");
    }
}

class Sample extends B13 implements A13 {
    public static void main(String[] args) {
        new Sample().test();
    }
}