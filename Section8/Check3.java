public class Check3 {
    public static void main(String[] args) {
        Class<Item2> clazz = Item2.class;
        Test2 test2 = clazz.getAnnotation(Test2.class);

        if (test2 == null) {
            return;
        }

        String name = test2.name();
        int price = test2.price();

        Item2 item2 = new Item2(name, price);

        System.out.println(item2.getName());
        System.out.println(item2.getPrice());


        // do something  
        System.out.println(clazz);
    }    
}
