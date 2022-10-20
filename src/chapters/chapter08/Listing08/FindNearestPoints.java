package chapters.chapter08.Listing08;

import java.util.Scanner;

public class FindNearestPoints {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of points:");
        int numberOfPoint = input.nextInt();

        double[][] points = new double[numberOfPoint][2];
        System.out.println("Enter " + numberOfPoint + " points");

        for (int i = 0; i < points.length; i++) { //  2,1  3,1 2,2 ... degerler giriliyor
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();

        }

        int p1 = -1;
        int p2 = -1;
        double shortestDistance = Double.MAX_VALUE;
        for (int i = 0; i < points.length ; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);

                if (shortestDistance > distance) {
                    shortestDistance = distance;
                    p1 = i;
                    p2 = j;

                }
            }

        }
        System.out.println("The closest two points are " +
                 "(" + points[p1][0] + ", " + points[p1][1] + ") and (" +
                 points[p2][0] + ", " + points[p2][1] + ")");
         }


    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
