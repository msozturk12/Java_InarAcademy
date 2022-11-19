package chapters.chapter11.Exercises11.exercise11_15;

import java.util.ArrayList;
import java.util.Scanner;

public class exercise11_15 {
    public static void main(String[] args) {
/*
-12 0 -8,5 10 0 11,4 5,5 7,8 6 -5,5 0 -7 -3,5 -3,5

Ex. number of points = 4 and the points 2 5 -4 3 5 1 2 5  area must be -->15
 */

        ArrayList<Double> points = getPointsFromUser();
        double area = getAreaOfPolygon(points);
        System.out.printf("The area of polygon is %.2f ",area);


    }
//-12 0 -8.5 10 0 11.4 5.5 7.8 6 -5.5 0 -7 -3.5 -3.5
    //formula of polygon : 0.5|(x1*y2 + x2*y3 + x3*y4 + x4*y5) - (y1*x1 + y2*x3 + y3*x4 + y4*x5)|
    public static double getAreaOfPolygon(ArrayList<Double> points) {

        double a = 0;
        for (int i = 0; i < points.size() - 3; i += 2) { //x1*y2 + x2*y3 + x3*y4 + x4*y5...
            a += points.get(i) * points.get(i + 3);
        }
        double b = 0;
        for (int i = 1; i < points.size() - 1; i += 2) {
            b += points.get(i) * points.get(i + 1);  //y1*x1 + y2*x3 + y3*x4 +...
        }
        double area = 0.5 * (a - b);
        return Math.abs(area);
    }

    private static ArrayList<Double> getPointsFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the points");
        int numberOfPoints = input.nextInt();

        ArrayList<Double> points = new ArrayList<>();
        System.out.println("Enter the coordinates of the points");

        for (int i = 0; i < numberOfPoints * 2; i++) {
            points.add(input.nextDouble());
        }
    return points;
    }
}
