import java.util.Date;

public class Check9 {
    public static void main(String[] args) {
        TestCalender9 a = new TestCalender9(new Date());
        TestCalender9 b = new TestCalender9(a);

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}

class TestCalender9 {
    private Date date;

    // 引数で受け取ったオブジェクトをそのまま代入しない
    public TestCalender9(Date date) {
        // this.date = date;
        this.date = new Date(date.getTime());
    }

    // コピーコンストラクタ
    public TestCalender9(TestCalender9 input) {
        this.date = new Date(input.date.getTime());
    }

    public Date getDate() {
        return (Date) date.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        TestCalender9 other = (TestCalender9) obj;
        if (date == null) {
            if (other.date != null) {
                return false;
            } else if (!date.equals(other.date)) {
                return false;
            }
            return true;
        }
        return false;
    }
}

