package chapters.chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_31 {
    public static void main(String[] args) {


        double[][] points = getPointsFromUsers();
        double[] intersectingPoint = getIntersectingPoint(points);
        displayIntersectingPoints(intersectingPoint);
    }

    public static void displayIntersectingPoints(double[] intersectingPoint) {
        if (intersectingPoint == null) {
            System.out.println("The two lines are parallel");
        } else {
            System.out.printf("The intersecting point is at (%.2f , %.2f )", intersectingPoint[0], intersectingPoint[1]);
        }

    }


    public static double[][] getPointsFromUsers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your points");
        double[][] points = new double[4][2];
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();

        }
        return points;
    }


    /*
        double a = y1 - y2;
		double b = -1 * (x1 - x2);
		double c = y3 - y4;
		double d = -1 * (x3 - x4);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
            0,0-->x1      1,0-->x2  2,0-->x3  3,0-->x4
            0,1-->y1      1,1-->y2  2,1-->y3  3,1-->y4

     */
    public static double[] getIntersectingPoint(double[][] points) {
        double[] intersectingPoints = new double[2];

        double x1 = points[0][0], y1 = points[0][1];
        double x2 = points[1][0], y2 = points[1][1];
        double x3 = points[2][0], y3 = points[2][1];
        double x4 = points[3][0], y4 = points[3][1];

        double a = y1 - y2;
        double b = -1 * (x1 - x2);
        double c = y3 - y4;
        double d = -1 * (x3 - x4);
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        //a * d - b*c == 0 if two lines are parellel
        if (a * d - b * c == 0) {
            return null;
        } else {
            intersectingPoints[0] = (e * d - b * f) / (a * d - b * c);
            intersectingPoints[1] = (a * f - e * c) / (a * d - b * c);
        }
        return intersectingPoints;
    }


}
