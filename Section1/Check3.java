package Section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Item implements Comparable<Item>{
    private String name;
    private int price;
    
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    // this method sort items as each name order
    @Override
    public int compareTo(Item target) {
        return name.compareTo(target.name);
    }

    /**
     * インナークラスとして扱うときstaticにすることで、呼び出し側でouter classをインスタンス化する必要はない
     * のでこちらの方が良い
     */
    public static class PriceComparator implements Comparator<Item> {
        @Override
        public int compare(Item a, Item b) {
            if(a.getPrice() < b.getPrice()) {
                return -1;
            }
            if (b.getPrice() < a.getPrice()) {
                return 1;
            }
            return 0;
        }
    }
}

public class Check3 {

    public static void main(String[] args) {

        List<Item> items = Arrays.asList(
            new Item[] {
                new Item("Orange", 100),
                new Item("Banana", 80),
                new Item("Apple", 120)
            }
        );

        // 名前順でsort
        Collections.sort(items);
        for(Item item: items) {
            System.out.println(item.getName() + " : " + item.getPrice());
        }

         // 値段でsort
        //  new OuterClass.InnerClass();とすると良い
         Collections.sort(items, new Item.PriceComparator());
         for(Item item: items) {
            System.out.println(item.getName() + " : " + item.getPrice());
         }
    }
}


/***
 * このように、Comparatorを実装することによって、独自に並べ替えを行うことが可能
 * このクラスは、Itemクラスを並べ替えるためだけに使うクラス
 * こういう特にInnerClassを用いると、カプセル化が強化される
 */

// class PriceComparator implements Comparator<Item> {
//     @Override
//     public int compare(Item a, Item b) {
//         if(a.getPrice() < b.getPrice()) {
//             return -1;
//         }
//         if (b.getPrice() < a.getPrice()) {
//             return 1;
//         }
//         return 0;
//     }
// }