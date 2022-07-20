package Section1;

// Outer class
class Check1 {

    // inner class
    // inner class can takes public and protected and private and abstract and final
    class Inner {
        // do something
    }

    // static inner class
    static class Inner_static {

    }


    public static void main(String[] stgd) {
        // local class
        // abstract and final are only alllowed to add local class
        class Local_class {
            // do something
        }
    }
}