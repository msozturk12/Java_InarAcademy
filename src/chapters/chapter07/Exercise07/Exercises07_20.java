package chapters.chapter07.Exercise07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises07_20 {
    public static void main(String[] args) {


        double[] numbers = getNumbersFromUser();
        getSelectionSort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static void getSelectionSort(double[] numbers) {      // 26 3 15 95 2
                                                                // 95 20 26 15 3
        for (int i = 0; i < numbers.length; i++) {
            double currentMax = numbers[i];
            int currentMaxIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > currentMax) {
                    currentMax = numbers[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMax != i) {   // i den farklı bir max bulunduysa //26 3 15 95 2-->95 3 15 26 2..
                numbers[currentMaxIndex] = numbers[i];
                numbers[i] = currentMax;

            }
        }

    }

    public static double[] getNumbersFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten double value");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        return numbers;
    }
}
