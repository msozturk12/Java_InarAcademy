package chapters.chapter13.Exercises13.Exercises13_14;

import chapters.chapter13.Listing13.Rational;

public class Rational13_14Test {
    public static void main(String[] args) {
        Rational r1 = new Rational(8, 3);
        Rational r2 = new Rational(5, 4);

        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
