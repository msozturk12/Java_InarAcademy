package chapters.chapter07.Exercise07;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Exercises07_12 {
    public static void main(String[] args) {
        /*
        reverse an array
        -array 10  -- copy reverse
        ex. 1 2 3 4 5 6 7 8 9 10
            10 9 8 7 6 5 4 3 2 1
         */

        int[] number = getNumbersFromUser();
        System.out.println(Arrays.toString(number));

       int [] reversed = reversedForm(number);
        System.out.println(Arrays.toString(reversed));

    }
// ex. 1 2 3 4 5 6 7 8 9 10    numbers
//     10 9 8 7 6 5 4 3 2 1    reverse
    private static int[] reversedForm(int[] number) {
        int [] reverse = new int[10];

        for (int i = 0,j=reverse.length-1; i <number.length ; i++,j--) {
            reverse[j]=number[i];

        }
       return reverse;
    }

    public static int[] getNumbersFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers ");
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();


        }
        return num;
    }
}
