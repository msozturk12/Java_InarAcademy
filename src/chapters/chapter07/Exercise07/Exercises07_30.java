package chapters.chapter07.Exercise07;

import java.util.Scanner;

public class Exercises07_30 {
    public static void main(String[] args) {

        /*
        -get numbers from user  first value will be size of your numbers
        -eger ard arda 4 sayı aynı gelirse
          -->the list has consecutive fours
         */
        int[] numbers = getNumbersFromUsers();

        if (isConsecutiveFour(numbers)) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");
        }
    }

    public static boolean isConsecutiveFour(int[] numbers) {
        int consecutiveCount = 0;  //3 4 5 5 5 5 4 5 -->true

        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i] == numbers[i + 1]) {
                consecutiveCount++;
            }
        }

        if (consecutiveCount == 3) {
            return true;
        }
        return false;
    }

    public static int[] getNumbersFromUsers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of values");
        int size = input.nextInt();
        int[] num = new int[size];

        System.out.println("Enter the values ");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();

        }
        return num;
    }
}
