package chapters.chapter08.Exercises08;


import java.util.Scanner;

public class Exercises08_01 {

    public static void main(String[] args) {

        System.out.println("Enter a 3-by-4 matrix row by row: ");
        double[][] list = new double[3][4];

        fillTheArray(list);
        printSumOfColumn(list);


    }
    public static void fillTheArray(double[][] list) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = input.nextDouble();

            }
        }
    }
    public static void printSumOfColumn(double[][] list) {
        for (int col = 0; col <list[0].length ; col++) {
            System.out.println("Sum of the elements at column "+ col + " is " + sumColumn(list,col));
        }
    }

    public static double sumColumn(double[][] list, int columnIndex) {
        double sumCol = 0;
        for (int row = 0; row < list.length; row++) {
            sumCol += list[row][columnIndex];
        }
    return sumCol;
    }



}
