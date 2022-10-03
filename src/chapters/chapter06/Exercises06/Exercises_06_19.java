package chapters.chapter06.Exercises06;

import java.util.Scanner;

public class Exercises_06_19 {
    /*
   kullanıcıdan side al
   boolean isValid

    return true if the sum of any two side is greater than th third side
        3 4 5 --> area --> 6
        120 130 200 -->
        7 2 3 --> invalid input
     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 side for your triangle");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();


        if (isValid(side1, side2, side3)) {
            System.out.printf("Your area is --> %.2f", getArea(side1, side2, side3));
        } else {
            System.out.println("Invalid input");
        }
    }

    public static double getArea(int side1, int side2, int side3) {

        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        return area;
    }

    public static boolean isValid(int side1, int side2, int side3) {
        return ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1));

    }


}
