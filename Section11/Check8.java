package Section11;

public class Check8 {
    
}

// module app {
//     exports app;
//     uses app.Hello; // app.HelloインターフェースをSPIとして使う
// }


// module-into.java
// module lib {
//     exports lib;
//     requires app;
//     provides app.Hello with lib.HelloImpl;
// }