// package Section1;

// public class Check6 {
    
//     public static void hello() {
//         /***
//          * メソッド内に定義しているので、ローカルクラスとなる
//          * ローカルクラスは、同じクラスであっても他のメソッドから使用することはできない
//          * 扱いはローカル変数と同じ
//          */
//         class Hello {
//             public void excute() {
//                 System.out.println("hello.");
//             }
//         }
//     }

//     public static void bey() {
//         class Bye {
//             public void excute() {
//                 System.out.println("Bye.");
//             }
//         }
        
//     }

//     public static void main(String[] args) {
//         bye().excute();
//     }

// }