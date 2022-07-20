package Section1;

public class Check7 {
    
    
}

/***
 * 匿名クラス
 * 匿名クラス、名前のないクラスを宣言し、そのクラスがどのようなフィールドやメソッドを持つべきかを定義したもの
 */
class ThreadSample {
    public static void main(String[] args) {

        /***
         * RunnableはInterfaceなのでインスタンス化できないが、コンストラクタ呼び出しの後に、クラスブロックを定義することで
         * 匿名クラスの定義と当時に、そのクラスのインスタンスを生成することができる
         */
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
    };
}


/***
 * 独自のメソッドを定義した匿名クラスも作成できる
 * varを用いることで、コンパイラが匿名クラスの定義情報から
 * どのようなメソッドがあるかを推測してくれる
 */
 class ObjectSample {
    public static void main(String[] args) {
        // Objectにはtest()がないので下の書き方だとコンパイルエラーが起きる
        // Object obj = new Object(){
        // のでvarによる型推論を行う    
        var obj = new Object(){
            public void test() {
                System.out.println("test");
            }
        };
        obj.test();
    }
 }

 