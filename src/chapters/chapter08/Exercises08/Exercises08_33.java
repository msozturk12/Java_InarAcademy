package chapters.chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_33 {
    public static void main(String[] args) {
        /*

                (Geometry: polygon subareas) A convex 4-vertex polygon is divided into four
        triangles, as shown in Figure 8.9.
        Write a program that prompts the user to enter the coordinates of four vertices and
        displays the areas of the four triangles in increasing order.
        -take points
        -find the small areas
        -and order them increasing order
        --2,5 2 4 4 3 -2 -2 -3,5
         */

        double[][] points = getPointsFromUsers();

        double[] intersectingPoints = getIntersecting(points);
        double[] smallAreas = getAreas(points, intersectingPoints);
        sort(smallAreas);
        System.out.printf("The areas are %4.2f %4.2f %4.2f %5.2f ", smallAreas[0], smallAreas[1], smallAreas[2], smallAreas[3]);

    }

    public static double[][] getPointsFromUsers() {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[4][2];
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();

        }
        return points;
    }

    private static double[] getIntersecting(double[][] points) {
        double[] temp = new double[2];
        /*
         double x1 = points[0][0], y1 = points[0][1];
        double x2 = points[1][0], y2 = points[1][1];
        double x3 = points[2][0], y3 = points[2][1];
        double x4 = points[3][0], y4 = points[3][1];
         */

        double a = points[0][1] - points[2][1];
        double b = -(points[0][0] - points[2][0]);
        double c = (points[1][1] - points[3][1]);
        double e = (points[0][1] - points[2][1]) * points[0][0] - (points[0][0] - points[2][0]) * points[0][1];
        double d = -(points[1][0] - points[3][0]);
        double f = (points[1][1] - points[3][1]) * points[1][0] - (points[1][0] - points[3][0]) * points[1][1];

        if (a * d - b * c == 0) {
            return null;
        } else {
            temp[0] = (e * d - b * f) / (a * d - b * c);
            temp[1] = (a * f - e * c) / (a * d - b * c);
        }

        return temp;
    }

    private static double[] getAreas(double[][] p, double[] intersectpoints) {
        double[] area = new double[4];

        area[0] = getSmallTriangleAreas(p[0][0], p[0][1], p[1][0], p[1][1], intersectpoints[0], intersectpoints[1]);
        area[1] = getSmallTriangleAreas(p[1][0], p[1][1], p[2][0], p[2][1], intersectpoints[0], intersectpoints[1]);
        area[2] = getSmallTriangleAreas(p[2][0], p[2][1], p[3][0], p[3][1], intersectpoints[0], intersectpoints[1]);
        area[3] = getSmallTriangleAreas(p[0][0], p[0][1], p[3][0], p[3][1], intersectpoints[0], intersectpoints[1]);

        return area;

    }

    private static double getSmallTriangleAreas(double x1, double y1, double x2, double y2, double x3, double y3) {

        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double side3 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));

        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        return area;

    }

    private static void sort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


}
