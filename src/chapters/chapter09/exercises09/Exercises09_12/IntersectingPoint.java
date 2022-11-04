package chapters.chapter09.exercises09.Exercises09_12;

import java.util.Scanner;

public class IntersectingPoint {
    public static void main(String[] args) {
        //2 2 5 -1,0 4,0 2,0 -1,0 -2,0 -->2.89 and 1.11
        //2 2 7 6,0 4,0 2,0 -1,0 -2,0  --> parallel
        double[][] points = getPointsFromUser();
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

        LinearEquation linear = new LinearEquation(a,b,c,d,e,f);

        displayIntersectingPoints(linear);


    }

    public static void displayIntersectingPoints(LinearEquation linear) {
       if(linear.isSolvable()){
           System.out.printf("The intersecting point is at (%.2f , %.2f) ",linear.getX(),linear.getY());
       }else{
           System.out.println("The two lines are parallel");
       }
    }

    public static double[][] getPointsFromUser() {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[4][2];
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();

        }
        return points;
    }


}
