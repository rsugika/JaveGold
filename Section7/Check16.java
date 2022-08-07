import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.print.attribute.standard.MediaSize.Other;

public class Check16 {
    public static void main(String[] args) {
       
        Item a = new Item("apple", 100);
        Item b = new Item("orange", 120);
        Item c = new Item("banana", 80);

        List<Item> list = Arrays.asList(a, b, c);
        // Collections.sort(list);
        list.forEach(System.out::println);

    }
}


class Item implements Compareble<Item> {
    private String name;
    private int price;

    public Item(String name, int price) {
        super();
        this.name = name;
        this.price = price;
    }
    // @Override
    public int compareTo(Item other) {
        if (this.price < other.price) {
            return -1;
        }
        if (other.price < this.price) {
            return 1;
        }
        return 0;
    }  
    
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item [name = " + name + ", price = " + price + "]";
    }
}