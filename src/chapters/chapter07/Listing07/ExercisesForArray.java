package chapters.chapter07.Listing07;

import java.util.Scanner;

public class ExercisesForArray {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        final int LENGTH_OF_ARRAY = 5;
        int[] arr = new int[LENGTH_OF_ARRAY];
        System.out.println("Enter " + arr.length + " number");

        /*
        for (int i = 0; i < arr.length; i++) {

            arr[i] = input.nextInt();
        }
        System.out.println(arr[2]);

 */
        System.out.println("Yazdırmaca");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }

        }


        System.out.println("\nRandom değerler atadık");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d", arr[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }

        }

        System.out.println(arr);//hash code of arr


        char[] city = {'D', 'a', 'l', 'l', 'a', 's'};
        System.out.println(city);

        System.out.println("----------------------------------");
        System.out.println("summing all digit");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println("Sum of digit af array " + sum);
        System.out.println("--------------------------------------");

        System.out.println("finding max value");
        System.out.println("Finding the smallest index of the largest element");
        int max = arr[0];
        int indexOfMax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                indexOfMax = i;
            }

        }
        System.out.println("max value is " + max);
        System.out.println("index of max " + indexOfMax);

        //Random shuffling:

        for (int i = 0; i < arr.length; i++) {
            int random = (int) (Math.random() * arr.length);

            int temp = arr[i];
            arr[i] = arr[random];
            arr[random] = temp;

        }
        readArray(arr);
        System.out.println("\n--------------------------------");
        //Shifting elements:to left
        int firstValue = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstValue;
        readArray(arr);
        System.out.println("\n--------------------------------");





    }

    public static void readArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
