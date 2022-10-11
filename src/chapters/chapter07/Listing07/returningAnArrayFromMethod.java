package chapters.chapter07.Listing07;

import java.util.Scanner;

public class returningAnArrayFromMethod {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();

        char[] arr = str.toCharArray();
        char[] reversedOfArray = reverse(arr);
        printArray(reversedOfArray);

    }
    public static void printArray(char[] number) {
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
        }
    }


    public static char[] reverse(char[] str) {
        char reversedArray[] = new char[str.length];

        for (int i = 0, j = reversedArray.length - 1; i < reversedArray.length; i++, j--) {
            reversedArray[j] = str[i];

        }
        return reversedArray;
    }
}
