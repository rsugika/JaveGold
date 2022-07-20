package Section2;

import java.util.function.Consumer;

public class Check4 {
    
}


/***
 * Consumerインターフェースは、インスタンスを生成するビルダーに利用することができる。
 * ビルダーとは次のItemクラスのインタークラスBuilderのようなクラスを指す。
 * ビルダーはコンストラクタの代わりにsetterメソッドを使ってんスタンスの初期化に必要な値を受け取る
 */

class Item {
    private int id;
    private String name;
    private int price;


    private Item(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.price = builder.price;
    }

    @Override
    public String toString() {
        return "Item [id = " + id + ", name = " + name + ", price = " + price + "]";
    }

    static class Builder {
        private int id;
        // private String name;
        // private int price;

        // Comsumer型のやつを使うには、ここをpublicにしておく
        public String name;
        public int price;



        public Builder(int id) {
            this.id = id;
        }

        // ここが実行されたときに下のラムダ式が実行される
        public Builder with(Consumer<Builder> consumer) {
            consumer.accept(this);
            return this;
        }

        // public Builder setName(String name) {
        //     this.name = name;
        //     return this;
        // }
        // public Builder setPrice(int price) {
        //     this.price = price;
        //     return this;
        // }
        public Item build() {
            return new Item(this);
        }
    }

}

/***
 * ItemクラスのインナークラスBilderを使うSampleクラス
 * これだと変更が生じたたびにコンストラクタの引数の数を変更しなくてはならん。
 */

 class Sample {
    public static void main(String[] args) {
        // Item item = new Item.Builder(100)
        //                     .setName("orange")
        //                     .setPrice(120)
        //                     .build();

        // このラムダ式が呼び出されるのは、withメソッド内でConsumerのacceptがよびたされるタイミング
        Item item = new Item.Builder(100)
                            .with(b -> {
                                b.name = "orange";
                                b.price = 120;
                            }).build();
        System.out.println(item);
    }
 }

 /***
  * Concumer型インターフェースを利用した場合
  */


