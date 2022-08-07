public class Check7 {
    public static void main(String[] args) {
        Test7<?> test = new Test7<>("Hello");
        String msg = (String) test.getValue();
        test.setValue(null);
    }
}

class Test7<T> {
    T value;

    public Test7(T value) {
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
