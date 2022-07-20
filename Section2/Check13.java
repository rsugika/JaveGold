package Section2;

import java.util.ArrayList;
import java.util.List;

public class Check13 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        /***
         * UnarayOperatorは、リストの値を一律に処理する場合に使用できる
         * Functionでも実装可能だが処理した結果の型を変える必要がないのであれば、UnarrayOperatorの方が適切
         */
        list.replaceAll(x -> x.toUpperCase());
        for(String str : list) {
            System.out.println(str);
        }
    }
    
}
