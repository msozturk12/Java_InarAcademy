package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of lines( 1 to 15) for pyramid : ");
        int lines = input.nextInt();

        for (int i = 1; i <= lines; i++) {
            for (int s = 1; s <= lines - i; s++) {
                System.out.print("   ");
            }
            for (int j = i; j > 0; j--) {
                System.out.printf("%3d" ,j);
            }

            for (int m = 2; m < i+1; m++) {
                System.out.printf("%3d",m);
            }

            System.out.println();
        }

    }
}
