public class Check8 {
    public static void main(String[] args) {

        // 上限境界ワイルドカードを使用したサンプルクラスとのその使用例
        Test8<? extends B8> test = new Test8<B8>(new B8());
        B8 b = test.getValue();
        b.hello();

        Test8<? extends B8> test2 = new Test8<C8>(new C8());
        B8 b2 = test2.getValue();
        b2.hello();

    }
}


class A8 {
    public void hello() {
        System.out.println("A");
    }
}

class B8 extends A8 {
    @Override
    public void hello() {
        System.out.println("B");
    }   
}

class C8 extends B8 {
    @Override
    public void hello() {
        System.out.println("C");
    }   
}

class Test8<T> {
    T value;

    public Test8(T value) {
        super();
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}