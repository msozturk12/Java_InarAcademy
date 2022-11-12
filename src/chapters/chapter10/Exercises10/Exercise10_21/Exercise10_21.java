package chapters.chapter10.Exercises10.Exercise10_21;

import java.math.BigInteger;

public class Exercise10_21 {
    public static void main(String[] args) {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "");
        int counter = 0;
        while (counter < 10) {
            if (number.remainder(new BigInteger("5")).equals(BigInteger.ZERO) ||
                    number.remainder(new BigInteger("6")).equals(BigInteger.ZERO)) {
                System.out.println(number);
                counter++;

            }
            number = number.add(BigInteger.ONE);

        }

    }
}
