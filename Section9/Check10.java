public class Check10 {
    public static void main(String[] args) {
        Item10 item = new Item10("apple", 100);
        item.setPrice(-1);
        System.out.println(item.getName() + "; " + item.getPrice());
    }
}


class Item10 {
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
    public void setName(String name) {
        // 事前条件の確認
        assert name != null : "name is null";
        this.name = name;
    }
    public void setPrice(int price) {
        // 前提条件の確認
        assert price > 0 : "invalid price : " + price;
        this.price = price;
    }
}