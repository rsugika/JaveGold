package Section11;
public class Check6 {
    public static void main(String[] args) {
        Lib lib = new Lib();
        lib.test();
    }
}

class Lib {
    public void test() {
        System.out.println("test");
    }
}


// Libモジュールのmodule-info.java
// module Lib {
    // exports com.sample.lib;
// }

// Clientモジュールのmodule-info.java
// module Client {
//     requires Lib;
// }
