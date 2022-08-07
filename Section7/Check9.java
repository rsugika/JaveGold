public class Check9 {
    public static void main(String[] args) {

        //  下限境界ワイルドカードの使用例
        Test9<? super B9> a = new Test9<A9>(new A9());
        Test9<? super B9> b = new Test9<B9>(new B9());

        // 型ぽらめーたにはB9もしくは、より上位しか使えないのでコンパイルエラー
        // Test9<? super B9> c = new Test9<C>(new C9());

        // A is not subclass of B, so compile error will occured
        // a.setValue(new A9());
        a.setValue(new B9());
        b.setValue(new C9());
      
        // use Object when get a value, because it does not sure what type
        Object objA = a.getValue();
        Object objB = b.getValue();
        System.out.println(objA);
        System.out.println(objB);

        // 任意の型で扱う場合にはキャスト式が必要
        A9 aObj = (A9) a.getValue();
        B9 bObj = (B9) b.getValue();
        System.out.println(aObj);
        System.out.println(bObj);
    }
}


class A9 {
    public void hello() {
        System.out.println("A");
    }
}

class B9 extends A9 {
    @Override
    public void hello() {
        System.out.println("B");
    }   
}

class C9 extends B9 {
    @Override
    public void hello() {
        System.out.println("C");
    }   
}

class Test9<T> {
    T value;

    public Test9(T value) {
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