package chapters.chapter11.Exercises11.Exercise11_01;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your three side of triangle");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println("Enter your triangle color");
        String color = input.next();

        System.out.println("Enter your triangle isFilled(true or false) ");
        boolean isFilled = input.nextBoolean();


        Triangle t1 = new Triangle(side1,side2,side3);
        t1.setColor(color);
        t1.setFilled(isFilled);
        t1.display();
        System.out.println("\n---------------------------");
        System.out.println(t1);

    }
}
