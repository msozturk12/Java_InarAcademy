package chapters.chapter12.Exercises12.Exercises12_05;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your three side of triangle");
            double side1 = input.nextDouble();
            double side2 = input.nextDouble();
            double side3 = input.nextDouble();

            Triangle1 t = new Triangle1(side1, side2, side3);
            t.display();

        } catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());

        }


    }
}
