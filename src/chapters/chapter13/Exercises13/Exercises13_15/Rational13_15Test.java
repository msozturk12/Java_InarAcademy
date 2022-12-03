package chapters.chapter13.Exercises13.Exercises13_15;

import chapters.chapter13.Listing13.Rational;

import java.math.BigInteger;

public class Rational13_15Test {
    public static void main(String[] args) {
       Rational13_15 r1 = new Rational13_15(new BigInteger("2010000000000"),new BigInteger("82200000000000"));
       Rational13_15 r2 = new Rational13_15(new BigInteger("400000000"),new BigInteger("8000000000"));

        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
