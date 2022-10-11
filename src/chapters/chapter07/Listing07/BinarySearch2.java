package chapters.chapter07.Listing07;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2 {
    public static void main(String[] args) {
        /*
        2,5,4,5,7,12,45,8,7,9,8,
        100-200
        ilk mid= (high+low)/2
        eger 1-num>mid
                low=mid+1
             2-num<mid
                high=mid -1
             3-num==mid
                num==mid

        */
        Scanner input = new Scanner(System.in);
        int[] arr = new int[20];
        getRandomValue(arr, 0, 50);
        Arrays.sort(arr);
        printArray(arr);
        System.out.println("Please enter the number you want to find");
        int num = input.nextInt();
        int index = getTheIndexWithTheBınarySearch(arr, num);
        System.out.printf("The number %d is in index [%d]", num, index);

    }

    private static int getTheIndexWithTheBınarySearch(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;

        while (high >= low) {
            int mid = low+ ((high-low) / 2);

            if (num < arr[mid]) {
                high = mid - 1;
            } else if (num > arr[mid]) {
                low = mid + 1;
            } else {

                return mid;
            }
        }

        return -1;
    }


    private static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("(%d) %d\n ", i, arr[i]);

        }

    }

    private static void getRandomValue(int[] arr, int start, int limit) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start + (int) (Math.random() * (limit - start));

        }

    }

}
