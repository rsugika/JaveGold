package Section1;

public class Check11 {
    
}

/***
 * InterfaceのデフォルトメソッドをOverrideしたとき、オーバーライドした側のメソッドから
 * デフォルトメソッドを呼び出すことができる。その時は、以下のフォーマットに従う必要がある。
 * 
 * InterfaceName.super.methodName();
 */

interface A {
    default void test() {
        System.out.println("A");
    }
}

interface B {
    default void test() {
        System.out.println("B");
    }
}

interface C extends B {}

interface D extends C {}

class Sample implements A, D {
    @Override
    public void test() {
        // insert code here
        A.super.test();

        // そもそも継承していない
        // B.super.test();
        // 2つ以上の階層にあるsuperInterfaceが持つmethodは呼び出せない
        // C.super.test();
    }
}