package chapters.chapter07.Listing07;

import java.util.Scanner;

public class ExercisesForArrayMethod {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        final int LENGTH_OF_ARRAY = 5;
        int[] arr = new int[LENGTH_OF_ARRAY];

        System.out.println("\nRandom değerler atadık");
        rassalNumberofArray(arr);


        System.out.println("\nsumming all digit");
        System.out.println("sum --> "+sumOfArray(arr));



        System.out.println("--------------------------------------");

        System.out.print("finding max value and ");
        System.out.println("Finding the smallest index of the largest element");
        findtheMaxValueAndIndex(arr);
        System.out.println("---------------------------------------");

        //Random shuffling:
        System.out.println("Random shuffling ");
        randomShufling(arr);
        writeArray(arr);


        System.out.println("\n--------------------------------");
        //Shifting elements:to left
        System.out.println("Shifting elements:to left");
        shiftingTheArrayToLeft(arr);
        writeArray(arr);


        System.out.println("\n--------------------------------");


    }

    private static void shiftingTheArrayToLeft(int[] arr) {
        int firstValue = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstValue;
    }

    private static void randomShufling(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int random = (int) (Math.random() * arr.length);

            int temp = arr[i];
            arr[i] = arr[random];
            arr[random] = temp;

        }
    }

    private static void findtheMaxValueAndIndex(int[] arr) {
        int max = arr[0];
        int indexOfMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                indexOfMax = i;
            }

        }
        System.out.println("max value is -->" + max);
        System.out.println("index of max--> " + indexOfMax);
    }

    private static int sumOfArray(int[] arr) {
       int sum =0;
        for (int number : arr) {
            sum += number;
        }
       return sum;
    }


    private static void rassalNumberofArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }

    }

    public static void writeArray(int[] arr) {
       int counter=0;
        for (int number : arr) {
            System.out.printf("%3d ", number);
            counter++;
            if ((counter + 1) % 10 == 0) {
                System.out.println();
            }

        }
    }
}
