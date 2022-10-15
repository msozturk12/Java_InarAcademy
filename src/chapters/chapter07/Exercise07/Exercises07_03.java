package chapters.chapter07.Exercise07;

import java.util.Scanner;

public class Exercises07_03 {
    public static void main(String[] args) {
        /*

        1 ile 100 arasında integer girilio
        0 girilince bitiyor do while yapılabilir

        tekrarları say -->count(numbers)


         */

        int[] occurrence = new int[100];
        System.out.println("Enter the ınteger between 1 and 100 :");
        count(occurrence);
        displayOccurrence(occurrence);

    }

    public static void displayOccurrence(int[] occurrence) {
        for (int i = 0; i < occurrence.length; i++) {
            if (occurrence[i] > 1) {
                System.out.printf("%d occurs %d times\n", i + 1, occurrence[i]);
            }
            if(occurrence[i]==1){
                System.out.printf("%d occurs %d time\n", i + 1, occurrence[i]);
            }

        }
    }


    public static void count(int[] occurrence) {
        Scanner input = new Scanner(System.in);
        int num;
        do {
            num = input.nextInt();
            if (1 <= num && num <= 100) {
                occurrence[num - 1]++;
            }

        } while (num != 0);

    }
}