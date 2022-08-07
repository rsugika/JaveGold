public class Check5 {
    
}


class A {
    public void hello() {
        System.out.println("A");
    }
}

class B extends A {
    @Override
    public void hello() {
        System.out.println("B");
    }
}

class C {
    public void hello() {
        System.out.println("C");
    }
 }

 // 総称型のTestクラス
//  制約付きの型パラメータを指定したTestクラス
 class Test<T extends A> {
    public void excute(T t) {
        t.hello();
    }
 }