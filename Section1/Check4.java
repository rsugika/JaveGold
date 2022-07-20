package Section1;

public class Check4 {

    // Access of a variable in enclosing class from innner class 
    static private String message = "Hello";
    static class Inner {
        public void test() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.test();
    }
}