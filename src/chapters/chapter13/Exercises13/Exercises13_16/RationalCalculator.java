package chapters.chapter13.Exercises13.Exercises13_16;

import chapters.chapter13.Listing13.L13_14Rational;

public class RationalCalculator {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("usage : java Exercise13_16 \"RationalNumber (+,-,/,*) RationalNumber\"");
        }
        String s = args[0];
        String[] str = s.split(" ");


        long n1 = Long.parseLong(str[0].charAt(0) + "");
        long d1 = Long.parseLong(str[0].charAt(2) + "");
        L13_14Rational r1 = new L13_14Rational(n1, d1);

        long n2 = Long.parseLong(str[2].charAt(0) + "");
        long d2 = Long.parseLong(str[2].charAt(2) + "");
        L13_14Rational r2 = new L13_14Rational(n2, d2);

        L13_14Rational result = new L13_14Rational(0,1);

        switch (str[1]) {
            case "+":
                result = r1.add(r2);
                break;
            case "-":
                result = r1.subtract(r2);
                break;
            case "/":
                result = r1.divide(r2);
                break;
            case "*":
                result = r1.multiply(r2);
        }
        System.out.println(n1 + " " + str[1] + " " + n2 + " = " + result);
    }
}
