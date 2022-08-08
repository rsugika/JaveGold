import java.io.Serializable;

public class Check13 {
    
}


// シリアライズ・プロキシを利用しない例
class Item13 implements Serializable {
    private String name;
    private int price;

    public Item13(String name, int price) {
        if (name == null || price < 0) {
            throw new IllegalArgumentException();
        }
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
        return "Item [name=" + name + ", price=" + price + "]"; 
    }
}

// シリアライズ・プロキシを利用した例
class Item13_ implements Serializable {

    private String name;
    private int price;

    public Item13_(String name, int price) {
        if (name == null || price < 0) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.price = price;
    }
    
    private Object writeReplace() {
        System.out.println("writeReplace");
        return new ItemSerializationProxy(name, price);
    }

    private static class ItemSerializationProxy implements Serializable {
        private final String n;
        private final int p;

        ItemSerializationProxy(String name, int price) {
            this.n = name;
            this.p = price;
        }
        private Object readResolve() {
            System.out.println("readResolve");
            return new Item13_(n, p);
        }
    }
}