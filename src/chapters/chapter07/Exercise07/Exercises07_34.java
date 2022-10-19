package chapters.chapter07.Exercise07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises07_34 {
    public static void main(String[] args) {
        /*
                Sort characters in a string) Write a method that returns a sorted string using the
        following header:
        public static String sort(String s)
        For example, sort("acb") returns abc.
        Write a test program that prompts the user to enter a string and displays the sorted
        string.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();

        String s1 = sort(str);
        System.out.println(s1);


    }
    //acb --> abc    mesut --> emstu

    public static String sort(String s) {
        char[] array = new char[s.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = s.charAt(i);
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    char temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return Arrays.toString(array);
    }


}
