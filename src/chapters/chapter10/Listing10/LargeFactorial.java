package chapters.chapter10.Listing10;

import java.math.BigInteger;

public class LargeFactorial {

    public static void main(String[] args) {
        System.out.println("50! is \n" + factorial(50));

    }

    private static BigInteger factorial(long n) {
        BigInteger result = new BigInteger("1");//==> BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));

        }
        return result;

    }
}
/*

        char[] charArray = {'G', 'o', 'o', 'd', ' ', 'D', 'a', 'y'};
        String message = new String(charArray);
        System.out.println(message);
 */