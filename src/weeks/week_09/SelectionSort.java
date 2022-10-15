package weeks.week_09;

import chapters.chapter07.Listing07.BinarySearch2;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        //7,9,3,5,12,6,2,5
        //2  en küçüğü bul

        int[] arr = new int[5];
        getRandomValue(arr, 0, 10);
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------------------");
        getSelectionSort(arr);
        System.out.println("INAR :" + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("JAVA : " + Arrays.toString(arr));

    }

    private static void getSelectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }

            }
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    private static void getRandomValue(int[] arr, int start, int limit) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start + (int) (Math.random() * (limit - start));

        }
    }
}