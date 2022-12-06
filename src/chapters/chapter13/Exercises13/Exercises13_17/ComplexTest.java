package chapters.chapter13.Exercises13.Exercises13_17;

import java.util.Scanner;

public class ComplexTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a and b for first complex number(a+bi)");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println("Enter a and b for second complex number(a+bi)");
        double c = input.nextDouble();
        double d = input.nextDouble();

        Complex complex1 = new Complex(a, b);
        Complex complex2 = new Complex(c, d);

        System.out.printf("%s + %s = %s\n", complex1.toString(), complex2.toString(), complex1.add(complex2).toString());
        System.out.printf("%s - %s = %s\n", complex1, complex2, complex1.subtract(complex2).toString());
        System.out.printf("%s * %s = %s\n", complex1, complex2, complex1.multiply(complex2).toString());
        System.out.printf("%s / %s = %s\n", complex1.toString(), complex2.toString(), complex1.divide(complex2).toString());
        System.out.printf("|%s| = %.6s\n",complex1, complex1.abs());
        System.out.printf("|%s| = %.6s\n", complex2, complex2.abs());
    }
}
