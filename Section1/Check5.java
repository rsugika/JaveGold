package Section1;

public class Check5 {
    
    void test() {
        Inner.message = "Hello, Java";
    }

    // Can not define static field and static method in not static inner class
    // In other hand, static inner method can take no static and static method
    static class Inner {
        private static String message;
        public void test() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        new Check5().test();
        new Inner().test();
    }

}
