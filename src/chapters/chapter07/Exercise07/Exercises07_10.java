package chapters.chapter07.Exercise07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises07_10 {
    /*
    -getNUmberFromUser
    indexOfMin=0;
    indexOfMin <-- i
    ex. 8 52 1 2 3 25 4 8 56 52
    indexOfSmallestElement--> 2

     */

    public static void main(String[] args) {


        final int LENGTH_OF_ARRAY = 10;
        double[] arr = new double[LENGTH_OF_ARRAY];
        System.out.println("Enter " + arr.length + " number");

        for (int i = 0; i < arr.length; i++) {
            Scanner input = new Scanner(System.in);
            arr[i] = input.nextDouble();
        }
        System.out.println(Arrays.toString(arr));
        int minIndex = indexOfSmallestElement(arr);
        System.out.println("Index of the Smallest element is : " + minIndex);
    }

    //ex. 8 52 1 2 3 25 4 8 56 52
    public static int indexOfSmallestElement(double[] arr) {
        double min = arr[0];
        int indexOfMin = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                indexOfMin = i;


            }
        }
        return indexOfMin;
    }


}
