import java.math.BigInteger;

public class Check3 {
    // 整数オーバーフローが発生しないかチェックする
    public long check3(long value) throws ArithmeticException {
        if ((value < Integer.MIN_VALUE) || (value > Integer.MAX_VALUE)) {
            throw new ArithmeticException("Integer overflow");
        }
        return value;
    }

    private static final BigInteger bigMaxInt = BigInteger.valueOf(Integer.MAX_VALUE);
    private static final BigInteger bigMinInt = BigInteger.valueOf(Integer.MIN_VALUE);

    public BigInteger check3_1(BigInteger val) throws ArithmeticException {
        if (val.compareTo(bigMaxInt) == 1 || val.compareTo(bigMinInt) == 1) {
            throw new ArithmeticException("Integer overflow");
        }
        return val;
    }
}


