package chapters.chapter07.Exercise07;

import java.util.Scanner;

public class Exercises07_15 {
    public static void main(String[] args) {
        /*
                        (Eliminate duplicates) Write a method that returns a new array by eliminating the
                duplicate values in the array using the following method header:
                public static int[] eliminateDuplicates(int[] list)
                Write a test program that reads in ten integers, invokes the method, and displays
                the result. Here is the sample run of the program:

           -take 10 number from users
           -yeni array açarız onun içine eger aynı sayı yoksa yazarız
         */
        Scanner input = new Scanner(System.in);
        final int LENGTH_OF_NUMBERS = 10;
        System.out.println("Enter " + LENGTH_OF_NUMBERS + " numbers");
        int[] numbers = new int[LENGTH_OF_NUMBERS];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int[] distinctNum = eliminateDuplicate(numbers);

        displayArray(distinctNum);
    }

    private static void displayArray(int[] distinctNum) {
        System.out.println("Distinct numbers are :");
        for (int i = 0; i <distinctNum.length ; i++) {
            System.out.print(distinctNum[i] + " ");

        }
    }

    //1 2 3 2 1 6 3 4 5 2
    //1 2 3 6 4 5
    public static int[] eliminateDuplicate(int[] numbers) {
        int[] eliminatedDistinctNumber = new int[numbers.length];
        int count=0;
        for (int i = 0; i < numbers.length-1; i++) {
            boolean isHave = true;
            for (int j = 0 ; j < eliminatedDistinctNumber.length; j++) {
                if (numbers[i] == eliminatedDistinctNumber[j]) {     //i=2
                    isHave = false;
                }

            }
            if (isHave) {
                eliminatedDistinctNumber[count] = numbers[i];
                count++;
            }

        }
        int[] result =new int[count];
        for (int i = 0; i <result.length ; i++) {
            result[i]=eliminatedDistinctNumber[i];

        }
    return result;
    }
}
