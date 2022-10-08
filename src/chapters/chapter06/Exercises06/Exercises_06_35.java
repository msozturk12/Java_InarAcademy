package chapters.chapter06.Exercises06;

import java.util.Scanner;

public class Exercises_06_35 {

    /*
    (Geometry: area of a pentagon)
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side ");
        double side = input.nextDouble();

        double a = area(side);
        System.out.println("The area of the pentagon is " + a);

    }

    public static double area(double side) {

        double areaOfPentagon = (5 * side * side) / (4 * Math.tan(Math.PI/5)) ;

        return areaOfPentagon;
    }


}
