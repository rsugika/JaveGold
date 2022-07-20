package Section1;

public class Check9 {
    
}

/**
 * InterfaceにStaticメソッドを定義できrっようになった。
 * そのため、実現クラスのインスタンス化がファクトリクラス無しでできるようになった
 * 
 * classのstaticメソッドと異なる点は、staticメソッドを使用する際に
 * 定義したインターフェース名を指定する必要があること
 */

interface A {
    static void test() {
        System.out.println("A");
    }
}

interface B extends A {}

class C implements A {}

class D implements A {
    public static void main(String[] args) {
        A.test();
        // ここから下はerror
        // B.test();
        // C.test();
        // test();
    }
}