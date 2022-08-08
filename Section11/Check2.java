package Section11;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Check2 {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj = Factory2.create();
        // インスタンスから元になったクラスの定義情報を取り出す
        Class clazz = obj.getClass();
        // クラスの定義情報から全てのメソッドの定義情報を取り出す
        Method[] methods = clazz.getDeclaredMethods();
        // メソッドの定義情報をもとにインスタンスのメソッドを呼び出す
        for (Method m : methods) {
            System.out.println(m.invoke(obj));
        }
    }
}

class Item2 {
    private String name;
    private int price;
    public Item2(String name, int price) {
        super();
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
}

class Factory2 {
    public static Object create() {
        return new Item2("apple", 100);
    }
}