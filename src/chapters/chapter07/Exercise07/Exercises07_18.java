package chapters.chapter07.Exercise07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises07_18 {
    public static void main(String[] args) {
        /*
            sayılar ikili ikili karşılaştırılıyor
            ve swap yapılıyor
         */

        double[] number = getNumbersFromUser();

        bubbleSorted(number);
        printArray(number);

    }

    public static void printArray(double[] number) {
        for(double num : number){
            System.out.print(num + "  ");
        }
    }

    // 12 5 2 36 98 56 26 95 85 65 32  -->
    public static void bubbleSorted(double[] number) {

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length-1 ; j++) {
                if (number[j] > number[j+1]) {
                    double temp = number[j];
                    number[j] = number[j+1];      // 5 12 2 36 98 56
                    number[j+1] = temp;           // 5 2 12 36 98 56
                }
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
