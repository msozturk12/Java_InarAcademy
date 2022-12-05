package chapters.chapter13.Exercises13.Exercises13_21;

import java.util.Scanner;

public class Exercises13_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b,c");
       Rational a = new Rational(input.nextLong(),1);
       Rational b = new Rational(input.nextLong(),1);
       Rational c = new Rational(input.nextLong(),1);

        //h= -b / 2a
        Rational h = new Rational(-b.getNumerator(),2*a.getNumerator());
        //k = f(h)= ah^2 + bh + c
        Rational k = (a.multiply(h.multiply(h)).add(b.multiply(h))).add(c);

        System.out.println("h is " + h + " k is " + k);

    }
}
