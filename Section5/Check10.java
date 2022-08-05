import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// package Section5;


public class Check10 {
    public static void main(String[] args) throws Exception {
    
       
        // serialize
        FileOutputStream fos = new FileOutputStream("sample.ser");
        ObjectOutputStream out = new ObjectOutputStream(fos);
        try (out) {
            Item10 item = new Item10("apple", 100);
            out.writeObject(item);
        }

        // deserialize
        FileInputStream fis = new FileInputStream("sample.ser");
        ObjectInputStream in = new ObjectInputStream(fis);
        try (in) {
            Object obj = in.readObject();
            Item10 item = (Item10) obj;
            System.out.println(item);
        };
    }
}

class Item10 implements Serializable{
    private String name;
    private int price;

    public Item10(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Item10 [ name = " + name + ", price = " + price + "]";
    }
}