package chapters.chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_32 {
    /*Geometry: area of a triangle)

    -takepoints from user
    -i need formula of triangle from ex 2.19
      -if the three points on the same line return 0
      -
     */

    public static void main(String[] args) {
        double[][] points = getPointsFromUser();
        double area = getTriangleArea(points);
        displayAreaOfTriangle(area);
    }

    public static void displayAreaOfTriangle(double area) {
        if(area == 0){
            System.out.println("The three points are on the same line");
        }else{
            System.out.printf("The area of the triangle is %.2f ",area);
        }

    }


    public static double[][] getPointsFromUser() {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[3][2];
        System.out.println("Enter x1, y1, x2, y2, x3, y3:");

        for (int p = 0; p < points.length; p++) {
            points[p][0] = input.nextDouble();
            points[p][1] = input.nextDouble();

        }
        return points;
    }

    /*
            double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
            double side2 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
            double side3 = Math.pow(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2), 0.5);
            formulas are from 2.19
     */
    public static double getTriangleArea(double[][] points) {
        double x1 = points[0][0], y1 = points[0][1];
        double x2 = points[1][0], y2 = points[1][1];
        double x3 = points[2][0], y3 = points[2][1];

        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
        double side3 = Math.pow(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2), 0.5);

        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        return area;

    }

}
