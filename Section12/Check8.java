public class Check8 {
    
}

// finalで修飾して継承を禁止
final class ImutableTest8 {
    // フィールドはfinalで宣言し変更させない
    private final int num;
    private final String str;

    // 外部のパッケージからはインスタンス化させない
    ImutableTest8(int num, String str) {
        this.num = num;
        this.str = str;
    }

    // getterは参照をそのまま戻さない
    // 新しいインスタンスを生成してその参照を戻す
    public String getStr() {
        return new String(str);
    }

    // setterは、下の値を変更せず
    // 新しい値を持った新しいインスタンスを生成して戻す
    public ImutableTest8 setStr(String str) {
        return new ImutableTest8(this.num, str);
    }
}

class TestBuilder {
    private int num;
    private String str;

    public void setName(int num) {
        this.num = num;
    }
    public void setStr(String str) {
        this.str = str;
    }
    public ImutableTest8 build() {
        // 値がセットされてなければデフォルト値をセット
        if (this.str == null) {
            this.str = "none";
        }
        return new ImutableTest8(num, str);
    }
}