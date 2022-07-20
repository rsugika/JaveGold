package Section1;

public class Check16 {
    public static void main(String[] args) {
        System.out.println(Sample.A);
    }
}


enum Sample {
    A("hello"), B("hello"), C("hello");
    private final String value;
    private Sample(String value) {
        System.out.println(value);
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}

// class Main {
//     public static void main(String[] args) {
//         System.out.println(Sample.A);
//     }
// }