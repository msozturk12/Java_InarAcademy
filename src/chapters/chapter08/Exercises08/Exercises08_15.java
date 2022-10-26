package chapters.chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_15 {
    public static void main(String[] args) {
        /*
        Geometry: same line?)
         * 1 - Anlat  we take 5 point and figure out is all tahat point on the same line
         * 2 - Ornekle ex. 1,1 2,2 3,3 4,4 5,5 are on the same line
         * 3 - Algoritmani sozel  (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0 same line formülü
         * 4 - Test case olustur ex. 1,1 2,2 3,3 4,4 -5,2 are not on the same line
         * 5 - Kod yaz
         * 6 - test et11

         */

        double[][] points = getPointsFromUsers();

        System.out.println("The five points are " + (sameLine(points) ? "" : "not") + " on the same line");

    }

    public static double[][] getPointsFromUsers() {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];
        System.out.println("Enter five points");
        for (int i = 0; i < 5; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();

        }
        return points;
    }

    public static boolean sameLine(double[][] points) {
        for (int i = 0; i < points.length; i++) {
            if (pointPosition(points[i][0], points[i][1], points[i + 1][0], points[i + 1][1], points[i + 2][0], points[i + 2][1]) != 0) {
                return false;
            }
        }

        return true;
    }

    // (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0; -->is same line, we re checking this
    public static double pointPosition(double x0, double y0, double x1, double y1, double x2, double y2) {
        return ((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0));

    }
}