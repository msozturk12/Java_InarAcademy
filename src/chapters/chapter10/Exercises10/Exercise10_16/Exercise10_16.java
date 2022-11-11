package chapters.chapter10.Exercises10.Exercise10_16;

import java.math.BigInteger;

public class Exercise10_16 {
    public static void main(String[] args) {
        /*
         *remainder
         *
         */
        BigInteger bi = new BigInteger("10000000000000000000000000000000000000000000000000");
        int counter = 0;
        while (counter < 10) {
            if (bi.remainder(new BigInteger("2")).equals(BigInteger.ZERO) ||
                    (bi.remainder(new BigInteger("3"))).equals(BigInteger.ZERO)) {
                System.out.println(bi);
                counter++;

            }
            bi = bi.add(BigInteger.ONE);
        }

    }
}