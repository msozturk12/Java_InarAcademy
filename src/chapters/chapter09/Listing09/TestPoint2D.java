package chapters.chapter09.Listing09;

import javafx.geometry.Point2D;

import java.util.Scanner;

public class TestPoint2D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter point1's x1 and y1 ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter point1's x2 and y2 ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        Point2D p1 = new Point2D(x1,y1);
        Point2D p2 = new Point2D(x2,y2);

        System.out.println("p1 is : " + p1.toString());
        System.out.println("p2 is : " + p2.toString());
        System.out.println("Distance between p1 and p2 is " + p1.distance(p2));



    }

}