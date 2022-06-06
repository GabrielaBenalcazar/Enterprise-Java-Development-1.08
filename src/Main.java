import java.math.BigDecimal;
import java.math.MathContext;

public class Main {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("4.2585");
        System.out.println(roundBigDec(b1));
    }
    public static double roundBigDec(BigDecimal bigDec){
        MathContext m = new MathContext(3); // 3 precision
        BigDecimal b2 = bigDec.round(m);
        return b2.doubleValue();
    }
}