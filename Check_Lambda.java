interface Algorithm {
    void perform(String name);
}

interface Ramen{
    String kindsOf(String name);
}

// 従来の書き方
// 実装クラスを定義して、メソッドをオーバーライドする
class XXX implements Algorithm {
    @Override
    public void perform(String name) {
        System.out.println("XXX" + name);
    }
}

class Service {
    private Algorithm logicl;
    public void setLogic(Algorithm logic) {
        this.logicl = logic;
    }
    public void doProcess(String name) {
        System.out.println("Start");
        System.out.println(name);
        System.out.println("end");
    } 
}

public class Check_Lambda {
    public static void main(String[] args) {

        // 匿名クラスの書き方、ここに書くとインナークラスとなる
        // 右辺の"new Algorithm()"は、"new Anonymous implements Algorithm()" を省略した書き方
        // 決して、インスタンス化しているわけではない
        Algorithm algorithm_1 = new Algorithm() {
            @Override
            public void perform(String name) {
                System.out.println("Hello " + name);
            }
        };

        // 匿名クラスをLambdaを用いて省略した書き方
        // 多分これが一番ベーシック
        Algorithm algorithm_2 = (String name) -> {
            System.out.println("Hello" + name);
        };
        Algorithm algorithm_3 = (name) -> {
            System.out.println("Hello" + name);
        };
        Algorithm algorithm_4 = name -> {
            System.out.println("Hello" + name);
        };
        Algorithm algorithm_5 = name -> System.out.println("Hello" + name);
    
        



        
    }
}
