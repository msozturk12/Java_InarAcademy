package chapters.chapter07.Exercise07;

import java.util.Scanner;

public class Exercises07_08 {
    public static void main(String[] args) {

        double[] numbers = getNumberFromUser();

        double average = average(numbers);

        System.out.println("Average --> " + average);
    }

    public static double[] getNumberFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        double[] num = new double[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextDouble();

        }
        return num;
    }


    public static int average(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }


}
