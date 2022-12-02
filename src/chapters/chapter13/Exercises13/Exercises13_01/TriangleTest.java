package chapters.chapter13.Exercises13.Exercises13_01;


import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Triangle sides");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println("Enter your Triangle color");
        String color = input.next();

        System.out.println("Is your Triangle filled or not?(True or False)");
        boolean filled = input.nextBoolean();

        Triangle t1 = new Triangle(color, filled, side1, side2, side3);
        System.out.println(t1);

    }
}
