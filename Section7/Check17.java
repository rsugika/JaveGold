import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Check17 {
    public static void main(String[] args) {
        Item a = new Item("apple", 100);
        Item b = new Item("banana", 120);
        Item c = new Item("orange", 80);

        List<Item> list = Arrays.asList(a, b, c);
        list.sort(new ItemNameComparator()); 
        list.forEach(System.out::println);
    }
}


class ItemNameComparator implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b) {
        return a.getName().compareTo(b.getName());
    }
}