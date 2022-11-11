package chapters.chapter10.Exercises10.Exercise10_15;

import chapters.chapter10.Exercises10.Exercise10_13.MyRectangle2D;

import java.util.Scanner;

public class TheBoundingRectangle {
    public static void main(String[] args) {

        //1,0 2,5 3 4 5 6 7 8 9 10
        double points[][] = getPointsFromUser();
        MyRectangle2D r = getRectangle(points);

        System.out.printf("The bounding rectangle's center (%.1f, %.2f) width %.1f height %.1f", r.getX(), r.getY(), r.getWidth(), r.getHeight());


    }


    private static double[][] getPointsFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five points");
        double[][] points = new double[5][2];
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();

        }
        return points;
    }



    /*
   -in bounding points find the xlow(x1) and find the xHigh(x2) -->  x2 - x1-->Width
   -in bounding points find the ylow(y1) and find the yHigh(y2) --> y2 - y1-->height
   -x2+x1 / 2 --> centerX
   -y2+y1/2 --> centerY
    */
    public static MyRectangle2D getRectangle(double[][] points) {
        double x1 = points[0][0]; //xlow
        double y1 = points[0][1];//ylow
        double x2 = points[0][0];//xhigh
        double y2 = points[0][1];//yhigh

        for (int i = 0; i < points.length; i++) {
            if (x1 > points[i][0]) {
                x1 = points[i][0];
            }
            if (x2 < points[i][0]) {
                x2 = points[i][0];
            }
            if (y1 > points[i][1]) {
                y1 = points[i][1];
            }
            if (y2 < points[i][1]) {
                y2 = points[i][1];

            }
        }
        double width = Math.abs(x2 - x1);//for avoiding negative value(Math.abs)
        double centerX = (x2 + x1) / 2;

        double height=Math.abs(y2 - y1);
        double centerY=(y1 + y2)/2;


        return new MyRectangle2D(centerX, centerY, width, height);

    }
}
