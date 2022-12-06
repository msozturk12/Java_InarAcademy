package chapters.chapter13.Exercises13.Exercises13_18;


import java.math.BigInteger;

public class E13_18 {
    public static void main(String[] args) {
        Rational sum = new Rational();
        for (int i = 1 ; i<=5; i++) {

            Rational number = new Rational(new BigInteger(String.valueOf(i)),new BigInteger(String.valueOf(i+1)));
            sum = sum.add(number);

        }
        System.out.println("Sum of 1/2 + 2/3 + 3/4...+99/100 summation series is --> " + sum);

    }
}
