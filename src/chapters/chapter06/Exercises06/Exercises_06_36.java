package chapters.chapter06.Exercises06;

import java.util.Scanner;

public class Exercises_06_36 {
    public static void main(String[] args) {
        /*
        (Geometry: area of a regular polygon)
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of side ");
        int numberOfSide = input.nextInt();
        System.out.println("Enter the side");
        double side = input.nextDouble();

        double a = area(numberOfSide, side);
        System.out.println("The area of the polygon is " + a);

    }

    public static double area(int n, double s) {

        double areaOfPolygon = (n * s * s) / (4 * Math.tan(Math.PI / n));
        return areaOfPolygon;
    }
}
