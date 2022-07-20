package Section1;

public class Check12 {
    
}

/***
 * インスタンスに2つの同じメソッドがinterfaceとsuperClassで定義されている場合、
 * superClassのメソッドが優先的に呼び出される。
 * interfaceはあくまでも型を提供することが目的であるため
 */

interface A {
    default void test() {
        System.out.println("A");
    }
}

class B {
    public void test() {
        System.out.println("B");
    }
}

class C extends B implements A {}

class Main {
    public static void main(String[] args) {
        A a = new C();
        a.test();
    }
}