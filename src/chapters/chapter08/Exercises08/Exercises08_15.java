package chapters.chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_15 {
    public static void main(String[] args) {
        /*
         * 1 - Anlat
         * 2 - Ornekle
         * 3 - Algoritmani sozel
         * 4 - Test case olustur
         * 5 - Kod yaz
         * 6 - test et

         */
        Scanner input = new Scanner(System.in);

        double[][] points = getPointsFromUsers();
        if (sameLine(points)) {
            System.out.println("The five points are on the same line");
        } else {
            System.out.println("The five points are not on the same line");
        }


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
        double x0 = points[0][0];
        double y0 = points[0][1];
        double x1 = points[1][0];
        double y1 = points[1][1];

        double x2 = points[2][0];
        double y2 = points[2][1];

        double x3 = points[3][0];
        double y3 = points[3][1];
        double x4 = points[4][0];
        double y4 = points[4][1];
        //(x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;

        double m = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);//ilk üç nokta aynı line da mı
        double n = (x3 - x2) * (y4 - y2) - (x4 - x2) * (y3 - y2);//son üç nokta aynı line da mı

        return (m == 0 && n == 0);

    }


}
