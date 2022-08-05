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

interface A9 {
    static void test() {
        System.out.println("A");
    }
}

interface B9 extends A9 {}

class C9 implements A9 {}

class D9 implements A9 {
    public static void main(String[] args) {
        A9.test();
        // ここから下はerror
        // B.test();
        // C.test();
        // test();
    }
}