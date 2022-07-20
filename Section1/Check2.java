package Section1;

public class Check2 {

    public static void main(String[] args) {
        Sample sample = new SampleImpl();
        // from here excute method is only accessible
        sample.excute();
    }
}

// to make and implements interface, programers can control access to make coupsel 
class SampleImpl implements Sample {
    public void test() {
        System.out.println("Test");
    }

    public void excute() {
        System.out.println("Excute");
    }
}



interface Sample {
    void excute();
}

class SampleFactory {
    public static Sample create() {

        // インナークラスをインスタンス化するには、初めにアウタークラスをインスタンス化する必要がある
        return new SampleFactory().new SampleImpl();
    }

    private class SampleImpl implements Sample {
        public void test() {
            System.out.println("test");
        }

        @Override
        public void excute() {
            System.out.println("excute");
        }
    }
}