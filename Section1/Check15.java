package Section1;

import javax.swing.text.AbstractDocument.BranchElement;

public class Check15 {
    
}


/***
 * 定数を定義したFruitインターフェース
 */

interface Fruits {
    public final static int APPLE = 0;
    public final static int ORANGE = 1;
    public final static int BANANA = 2;
}

/***
 * switch文で分岐処理を行うSampleクラス
 * 数値で行う場合。
 * 課題：各数値の意味から内容を推測できない
 */

 class SampleNumber {
    public static void main(String[] args) {
        int number = 0;
        switch(number) {
            case 0:
                System.out.println("apple");
                break;
            case 1:
                System.out.println("orange");
                break;
            case 2:
                System.out.println("banana");
                break;

        }
    }
 }

 /***
 * switch文で分岐処理を行うSampleクラス
 * 定数で行う場合
 * 課題：プログラムの規模が大きくなるにつれ定数が増えて、値が重複してしまう
 */

  class SampleConstant {
    public static void main(String[] args) {
        int number = 0;
        switch(number) {
            case Fruits.APPLE:
                System.out.println("apple");
                break;
            case Fruits.ORANGE:
                System.out.println("orange");
                break;
            case Fruits.BANANA:
                System.out.println("banana");
                break;

        }
    }
 }

 /***
  * 上記の課題を解決するためにEnumを用いる
  * javaではEnumはクラスとして扱われる
  */

  enum FruitsAsEnum {
    APPLE, ORANGE, BANANA, MELON;
  }

  class SampleEnum {
    public static void main(String[] args) {
        FruitsAsEnum type = FruitsAsEnum.APPLE;
        switch(type) {
            case APPLE:
                System.out.println("apple");
                break;
            case ORANGE:
                System.out.println("orange");
                break;
            case BANANA:
                System.out.println("banana");
                break;
        }
    }
  }


  /***
   * プログラマが定義した独自のEnumには、次の2つのメソッドが追加される
   * ".values()" and ".valueOf()"
   */

  class GetEnum {
    public static void main(String[] args) {
        for (FruitsAsEnum f : FruitsAsEnum.values()) {
            System.out.println(f);
        }

        // values()の返り値は配列なので要素を指定して取り出せる
        System.out.println(FruitsAsEnum.values()[1]);
        // valueOf()は列挙子の名前からインスタンスを返す
        System.out.println(FruitsAsEnum.valueOf("APPLE"));

    }
  }