public class Check2 {
    
}

@Test2(name = "test", price = 100)
class Item2 {
    private String name;
    private int price;

    public Item2(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName()  {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

@interface Test2 {
    String name();
    int price();
}

// 注釈パラメータとしてvalueを受け取るアノテーション
@interface SampleValue {
    String value();
}

// 注釈パラメータの値のみを記述
@SampleValue("Sample")
class UseSample {

}

// 注釈パラメータと値を記述
@SampleValue(value="Sample")
class UseSample2 {

}

@interface ArrayValues {
    int[] data();
}

// アノテーションに複数の値を渡す
@ArrayValues(data = {1, 2, 3})
class  ArrayValueSample {

}

// 注釈パラメータのデフォルト値を設定
@interface DefaultValue {
    String test() default "default";
}

@DefaultValue
class DefaultValueSample {

}