package chapters.chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_30 {
    public static void main(String[] args) {
        double[][] points = getPoints();// 2 *2 matrix
        double[] b = getB(); // b0 and b1
        double[] result = linearEquation(points, b);
        displayResult(result);

    }


    public static double[][] getPoints() {
        double[][] points = new double[2][2];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a00,a01,a10,a11 ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }

    public static double[] getB() {
        Scanner input = new Scanner(System.in);
        double[] b = new double[2];
        for (int i = 0; i < b.length; i++) {
            b[i] = input.nextDouble();

        }
        return b;
    }

    //a * d - b * c == 0
    public static double[] linearEquation(double[][] a, double[] b) {

        if ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]) == 0) {
            return null;
        }
        double[] r = new double[2];

        r[0] = (b[0] * a[1][1] - b[1] * a[0][1] )/ (a[0][0] * a[1][1] - a[0][1] * a[1][0]);//x
        r[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);//y


        return r;
    }

    public static void displayResult(double[] result) {
        if (result == null) {
            System.out.println("The equation has no solution");
        } else {
            System.out.println("x is --> " + result[0] + " and y is " + result[1]);
        }
    }
}



