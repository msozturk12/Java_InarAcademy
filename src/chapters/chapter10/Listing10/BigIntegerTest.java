package chapters.chapter10.Listing10;

import java.math.*;

public class BigIntegerTest {

    public static void main(String[] args) {

        BigInteger bi = new BigInteger("1232468798");
        BigInteger b3 = bi.multiply(BigInteger.valueOf(20000));
        System.out.println(b3);

        bi = new BigInteger("794561365498798795464");
        bi = bi.multiply(new BigInteger("5"));
        System.out.println(bi);

        BigDecimal a = new BigDecimal(1.0);
        BigDecimal b = new BigDecimal(3);
        BigDecimal c = a.divide(b, 20, BigDecimal.ROUND_UP);//noktadan sonra 20 sayı
        System.out.println(c);


    }
}
