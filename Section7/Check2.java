import java.util.ArrayList;
import java.util.List;

public class Check2 {
    public static void main(String[] artgs) {
        List list = new ArrayList();
        list.add(10);
        list.add("java");
        list.add(new Object());

        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            System.out.println(str);
        }
    }
}

// class ItemList2 {
//     private List list = new ArrayList();
//     public void add(Item item) {
//         this.list.add(item);
//     }
//     public Item2 get(int inddex) {
//         return (Item) this.List.get(index);
//     }
//     public int size() {
//         return this.list.size();
//     }
// }

class Currency {
    private Integer amount;
    public Currency (Integer amount) {
        super();
        this.amount = amount;
    }
    public Integer getAmount() {
        return amount;
    }
}

class Currency2<T> {
    private T amount;
    public Currency2 (T amount) {
        super();
        this.amount = amount;
    }

    public T getAmount() {
        return amount;
    }
}