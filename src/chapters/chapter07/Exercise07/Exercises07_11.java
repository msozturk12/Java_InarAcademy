package chapters.chapter07.Exercise07;

import java.util.Scanner;

public class Exercises07_11 {
    public static void main(String[] args) {
        /*
        get ten(dinamik)  number from user
        numbers arrayinin mean bul
        numbers arrayinin deviation bul
         */

        Scanner input = new Scanner(System.in);
        final int LENGHT_OF_LIST = 10;
        System.out.printf("Enter %d numbers ", LENGHT_OF_LIST);
        double[] numbers = new double[LENGHT_OF_LIST];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        double mean = mean(numbers);
        double deviation = deviation(numbers);
        System.out.printf("The mean is --> %4.2f", mean);
        System.out.println();
        System.out.printf("The standart deviation is --> %7.5f ", deviation);


    }

    public static double deviation(double[] numbers) {
        double mean=0;
        double deviationSquare=0;
        for (int i = 0; i <numbers.length ; i++) {
            mean+=numbers[i];
            deviationSquare+=Math.pow(numbers[i],2);//each numbers x^2
        }
        double deviation=Math.sqrt((deviationSquare - Math.pow(mean,2)/10) / (10 -1));//formula that given from question

        return deviation;
    }

    public static double mean(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        return sum / numbers.length;
    }
}
