package chapters.chapter10.Exercises10.Exercise10_17;

import java.math.BigInteger;

public class SquareNumber {
    public static void main(String[] args) {

       long square = (long)(Math.sqrt(Long.MAX_VALUE));
       BigInteger number = new BigInteger(square + "");

        System.out.println("Long.MAX_VALUE is " + Long.MAX_VALUE);
        for (int i = 0; i < 10; i++) {
            System.out.println(number.multiply(number));
            number = number.add(BigInteger.ONE);

        }

    }
}

