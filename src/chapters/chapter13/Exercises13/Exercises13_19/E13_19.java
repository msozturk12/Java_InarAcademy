package chapters.chapter13.Exercises13.Exercises13_19;


import chapters.chapter13.Exercises13.Exercises13_15.Rational13_15;

import java.math.BigInteger;
import java.util.Scanner;

public class E13_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        String number = input.nextLine();
        String [] dec = number.split("[.]");
        Rational13_15 r1 = new Rational13_15(new BigInteger(dec[0]),BigInteger.ONE);
        Rational13_15 r2= new Rational13_15(new BigInteger(dec[1]),new BigInteger(String.valueOf((int)(Math.pow(10,dec[1].length())))));

        System.out.println("The fraction number is " +( dec[0].charAt(0) == '-' ? r1.subtract(r2):r1.add(r2)));

    }
}
