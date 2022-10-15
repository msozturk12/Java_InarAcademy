package chapters.chapter07.Exercise07;

import java.util.Scanner;

public class Exercises07_26 {
    public static void main(String[] args) {
        /*
        (Strictly identical arrays)
        -enter two list
        -Note that the first number in the input indicates the number of the elements in the list.(*)
        -ilk sayı bu listin bir parçası olmıcak

         */
        System.out.println("Enter your list1 (first number is your size)");
        int[] list1 = getValueFromUsers();
        System.out.println("Enter your list2 (first number is your size)");
        int[] list2 = getValueFromUsers();

        System.out.println(isStrictlyIdentical(list1, list2) ? "Two list are strictly identical " : " Two lists are not strictly identical");


    }

    public static boolean isStrictlyIdentical(int[] list1, int[] list2) {                                   //list1  5 2 5 6 1 6
        for (int i = 0, j = 0; i < list1.length && j < list2.length; i++, j++) {                           //list2  5 2 5 6 1 6

            if (list1[i] != list2[j]) {
                return false;
            }

        }
        return true;
    }

    public static int[] getValueFromUsers() {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

        }
        return numbers;
    }
}
