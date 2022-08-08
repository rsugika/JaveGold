package Section11;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Check7 {
    public static void main(String[] args) {
        Iterator<Hello7> hellos = ServiceLoader.load(Hello7.class).iterator();
        while(hellos.hasNext()) {
            Hello7 h = hellos.next();
            System.out.println(h.hello());
        }
    }
}

interface Hello7 {
    public String hello();
}

class HelloImpl7 implements Hello7 {
    @Override
    public String hello() {
        return "Hello, SPI!";
    }
}