package chapters.chapter07.Exercise07;

import java.util.Scanner;

public class Exercises07_05 {
    public static void main(String[] args) {
        /*
        print district number
        -read 10 number
        -distinct te var mı varsa false
        -display distinct number separated by one space " "
        -boolean contains distinct number
        1 2 3 4 5 6 7
        -  1 2 3 2 1 6 3 4 5 2
        -->1 2 3 6 4 5
         */

        int[] numbers = getNumbersFromUser();

       int[] distinctNumbers= new int[10];

       int countDistinct=0;

        for (int i = 0; i <numbers.length ; i++) {
            if(isContains(distinctNumbers, countDistinct, numbers[i])){
                distinctNumbers[countDistinct]=numbers[i];
                countDistinct++;
            }

        }
        displayDistinct(distinctNumbers,countDistinct);


    }

    public static boolean isContains(int[] distinctNumbers, int countDistinct, int numbers) {
        for (int i = 0; i <countDistinct ; i++) {
            if(distinctNumbers[i]==numbers){
                return false;
            }

        }
        return true;
    }

    // 1 2 3 2 1 6 3 4 5 2
    //     -->1 2 3 6 4 5
    public static void displayDistinct(int[] numbers,int count) {
        System.out.println("The number of distinct number is " + count);
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i]+ " ");
            
        }
    }


    public static int[] getNumbersFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

        }
   return numbers;
    }
}
