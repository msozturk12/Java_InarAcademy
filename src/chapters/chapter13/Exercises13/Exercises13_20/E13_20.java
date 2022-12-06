package chapters.chapter13.Exercises13.Exercises13_20;

import java.util.Scanner;

public class E13_20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - (4 * a * c);
        if (Math.pow(b, 2) - 4 * a * c > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2*a) ;
            double root2 = (-b - Math.sqrt(discriminant)) / (2*a) ;

            System.out.println("The equation has two roots: " + root1 + " " + root2);

        } else if (discriminant == 0) {

            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);

            System.out.println("The equation has one roots: " + root1);
        } else {
            Complex c1 = new Complex(-b / (2 * a), Math.sqrt(-1 * discriminant) / (2 * a));
            Complex c2 = new Complex(-b / (2 * a), Math.sqrt(-1 * discriminant) / (2 * a));
            System.out.println("The roots are " + c1 + " and " + c2);
        }

    }
}
