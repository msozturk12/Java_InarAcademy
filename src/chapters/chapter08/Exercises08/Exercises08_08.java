package chapters.chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_08 {
    public static void main(String[] args) {
        /*
            -take number of points
            -get 8 points

         */


        double[][] points = takePointsFromUser();
        displayClosestTwoPoints(points);


    }

    public static void displayClosestTwoPoints(double[][] points) {

        double shortestPoint = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            for (int j = i+1; j < points[i].length; j++) {  //karşılaştır sdistance eşitse yazdır
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);

                if (shortestPoint > distance) {
                    shortestPoint = distance;

                }
            }
        }
        displayClosestPairs(points, shortestPoint);

    }

    public static void displayClosestPairs(double[][] points, double shortestPoint) {
        int p1;
        int p2;

        for (int i = 0; i < points.length; i++) {
            for (int j = i+1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);

                if (shortestPoint == distance) {
                    shortestPoint = distance;
                    p1 = i;
                    p2 = j;

                    System.out.printf("The closest two points are (%.1f ,%.1f) and (%.1f ,%.1f)\n", points[p1][0], points[p1][1],points[p2][0], points[p2][1]);

                }
            }
        }
        System.out.println("their distance is --> " + shortestPoint + "\n");
    }


    public static double[][] takePointsFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of points");
        int numberOfPoint = input.nextInt();

        System.out.println("Enter " + numberOfPoint + " points");
        double[][] points = new double[numberOfPoint][2];

        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();

        }

        return points;
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

}
