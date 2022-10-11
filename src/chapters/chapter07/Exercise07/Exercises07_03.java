package chapters.chapter07.Exercise07;

import java.util.Scanner;

public class Exercises07_03 {
    public static void main(String[] args) {
        /*

        1 ile 100 arasında integer girilio
        0 girilince bitiyor do while yapılabilir

        tekrarları say -->count(numbers)




                (Count occurrence of numbers) Write a program that reads the integers between 1
        and 100 and counts the occurrences of each. Assume the input ends with 0. Here
        is a sample run of the program:

         */

        int[] numbers = new int[100];
        System.out.println("Enter the ınteger between 1 and 100 :");

        count(numbers);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.printf("%d occurs %d times\n", i + 1, numbers[i]);
            }
            if(numbers[i]==1){
                System.out.printf("%d occurs %d time\n", i + 1, numbers[i]);
            }

        }

    }


    public static void count(int[] numbers) {
        Scanner input = new Scanner(System.in);
        int sayı;
        do {
            sayı = input.nextInt();
            if (1 <= sayı && sayı <= 100) {
                numbers[sayı - 1]++;
            }

        } while (sayı != 0);

    }
}