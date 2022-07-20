package Section2;

import java.util.function.Supplier;

public class Check2 {
    
}

/***
 * Supplierインターフェース
 * メソッド参照、ラムダ式との組み合わせ等
 * interfaceのメソッドをimplementsしたクラスを直接呼び出すことなく処理を行う方法
 */

interface A {
    void hello();
}

// 使われるクラス
class B implements A {
    @Override
    public void hello() {
        System.out.println("Bの独自処理");
    }
}

class C implements A {
    @Override
    public void hello() {
        System.out.println("Cの独自処理");
    }
}

class Factory {
    public static A create() {
        return new B();
        // ここでC()を返せば、Cの独自処理がTestの中で呼び出されて実行される
        // return new C();
    }
}


/***
 * 利用しているクラスは、どの実現クラスが動作しているかを知る必要がない。
 * 下の例では、interfaceのhello()を継承しているクラスBが実現クラスに当たる。
 * 使うクラスと使われるクラスが直接結びつかないようにすることで使われる側の変更の影響を
 * 最小限に抑えることができる
 */
class Test {
    public void excute() {
        System.out.println("事前処理");
        A a = Factory.create();
        a.hello();
        System.out.println("事後処理");
    }
}

class Sample {
    public static void main(String[] args) {
        Test test = new Test();
        test.excute();
    }
}

/***
 * 上記の処理をSupplierを使用したものに変更すると、ファクトリクラスが不要になる
 * Testクラスのexcuteメソッドを呼び出す際に、Bのインスタンスを生成するラムダ式を引数として渡すと
 * Supplierのgetメソッドを呼び出したタイミングでラムダ式が実行される
 * このとき、Bのインスタンスが生成され、その参照がA型として戻される
 */

 class TestSupplier {
    public void excute(Supplier<A> supplier) {
        System.out.println("事前処理");
        A a = supplier.get();
        a.hello();
        System.out.println("事後処理");
    }
 }

 class SampleSupplier { 
    public static void main(String[] args) {
        TestSupplier testSupplier = new TestSupplier();
        testSupplier.excute(() -> new B());
        System.out.println("");
        // Cクラスを使う場合は、引数に渡すラムダ式を変更するだけ。簡潔になる
        testSupplier.excute(() -> new C());
        System.out.println("");
        // なお、関数型インターフェースは、ラムダ式だけでなく、メソッド参照でも利用できる
        testSupplier.excute(B::new);
        System.out.println("");
        testSupplier.excute(C::new);
    }
 }