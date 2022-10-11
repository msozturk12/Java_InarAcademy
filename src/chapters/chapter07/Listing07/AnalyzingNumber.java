package chapters.chapter07.Listing07;

import java.util.Scanner;

public class AnalyzingNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your array size");
        int arraySıze = input.nextInt();
        double[] list = new double[arraySıze];
        double sum = 0;

        System.out.println("Enter your numbers");
        getNumberFromUsers(list);
        getSum(list);
        double average = getAverage(list);
        int averageCounter = getAverageCounter(list);
        System.out.printf("Average is--> %f \nNumber of elements above the average is --> (%d) ", average, averageCounter);

    }

    public static int getAverageCounter(double[] list) {
        int averageCounter = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > getAverage(list)) {
                averageCounter++;
            }
        }
        return averageCounter;
    }

    public static double getAverage(double[] list) {
        double average = getSum(list) / list.length;
        return average;
    }

    public static void getNumberFromUsers(double[] list) {
        for (int i = 0; i < list.length; i++) {
            Scanner input = new Scanner(System.in);
            list[i] = input.nextDouble();

        }
    }

    public static double getSum(double[] list) {
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum;
    }
}


