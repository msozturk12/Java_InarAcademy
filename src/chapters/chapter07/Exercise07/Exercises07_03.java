package chapters.chapter07.Exercise07;

import java.util.Scanner;

public class Exercises07_03 {
    public static void main(String[] args) {
        /*

        1 ile 100 arasında integer girilio
        0 girilince bitiyor do while yapılabilir

        tekrarları say -->count(numbers)


         */

        int[] numbers = new int[100];
        System.out.println("Enter the ınteger between 1 and 100 :");
        count(numbers);
        displayOccurrence(numbers);

    }

    public static void displayOccurrence(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 1) {
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