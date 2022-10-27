package chapters.chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_34 {
    public static void main(String[] args) {
        /*
        -take points from user
        -right most lowest --> x,y  y-> ilk amaç bu-> aralarındaki en küçük değer olucak
                                    x-> y ye bakıcak ve eşitse büyük olanını alıcak
                                    ex.1,5 2,5 -3 4,5 5,6 -7 6,5 -7 8 1 10 2,5
         */


        double[][] points = getPointsFromUsers();

        double[] rightmostLowestPoint = getRightmostLowestPoint(points);
        System.out.printf("The rightmost lowest point is (%3.1f , %3.1f) ", rightmostLowestPoint[0], rightmostLowestPoint[1]);
    }


    public static double[][] getPointsFromUsers() {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[6][2];
        System.out.println("Enter 6 points");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();

        }
        return points;
    }

    public static double[] getRightmostLowestPoint(double[][] points) {
        double[] result = new double[2];

        result[0] = points[0][0];
        result[1] = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (result[1] > points[i][1] || ((result[1] == points[i][1] && result[0]>points[0][0]))) {
                result[0]=points[i][0];
                result[1]=points[i][1];

                }

        }
        return result;

    }
}
