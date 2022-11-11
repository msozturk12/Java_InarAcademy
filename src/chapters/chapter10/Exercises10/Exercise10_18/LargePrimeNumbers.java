package chapters.chapter10.Exercises10.Exercise10_18;

import java.math.BigInteger;

public class LargePrimeNumbers {
    public static void main(String[] args) {

        BigInteger number = new BigInteger(Long.MAX_VALUE + "");

        int counter = 0;
        while (counter < 5) {
            if (isPrime(number)) {
                System.out.println(number);
                counter++;
            }
            number = number.add(BigInteger.ONE);
        }
    }

    private static boolean isPrime(BigInteger number) {
        for (BigInteger divisor = new BigInteger("2"); divisor.compareTo(number.divide(new BigInteger("2"))) <= 0; divisor = divisor.add(new BigInteger("1"))) {
            if ((number.remainder(divisor).compareTo(BigInteger.ZERO)) == 0) {
                return false;
            }

        }
        return true;
    }
}