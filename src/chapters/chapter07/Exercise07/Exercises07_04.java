package chapters.chapter07.Exercise07;

import java.util.Scanner;

public class Exercises07_04 {
    public static void main(String[] args) {
        /*
       -read unspecified number of score
       -determines how many score are above or equals to the average and (above,equals,below)
       -For end the input use negative number
       -assume that max number of score -> 100
         */
        Scanner input = new Scanner(System.in);


        double[] arr = new double[100];
        System.out.println("Enter numbers");
        getScore(arr);
        getSum(arr);
        getAverage(arr);
        displayAboveEqualsAndBelowScore(arr);



    }

    public static void displayAboveEqualsAndBelowScore(double[] arr) {
        double below = 0;
        double above = 0;
        double equal = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] > getAverage(arr)) {
                    above++;
                } else if (arr[i] == getAverage(arr)) {
                    equal++;
                } else {
                    below++;
                }
            }

        }
        System.out.println("Number of score above to the average " + above);
        System.out.println("Number of score equal to the average " + equal);
        System.out.println("Number of score below to the average " + below);
    }

    private static double getSum(double[] arr) {
        int sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum;
    }

    private static double getAverage(double[] arr) {
        return getSum(arr) / arr.length;
    }

    private static void getScore(double[] arr) {
        Scanner input = new Scanner(System.in);
        double number;
        int i = 0;
        do {
            number = input.nextInt();
            arr[i] = number;
            i++;
        } while (number >= 0);
    }
}
