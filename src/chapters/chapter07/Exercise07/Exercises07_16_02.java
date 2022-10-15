package chapters.chapter07.Exercise07;

import java.util.Arrays;

public class Exercises07_16_02 {
    public static void main(String[] args) {

        int[] numbers = getRandomValue();
        int key = getRandomKey();

        long executionTimeForLinearSearch = getExecutionTimeForLinearSearch(numbers, key);
        long executionTimeForBinarySearch = getExecutionTimeForBinarySearch(numbers, key);

        System.out.println("The execution time for linear search is : " + executionTimeForLinearSearch);
        System.out.println("The execution time for binary search is : " + executionTimeForBinarySearch);

    }

    public static long getExecutionTimeForBinarySearch(int[] numbers, int key) {
        long startTime = System.currentTimeMillis();
        binarySearch(numbers, key);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static int binarySearch(int[] numbers, int key) {// 7 15 26 46 56 96 120 150 210
        Arrays.sort(numbers);
        int low = 0;
        int high = numbers.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;

            if (key > numbers[mid]) {
                low = mid + 1;
            } else if (key < numbers[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

    public static int getRandomKey() {
        final int LENGTH=100_000;
        return (int) (Math.random() * LENGTH);
    }

    public static int[] getRandomValue() {
        final int LENGTH=100_000;
        int[] randomValues = new int[LENGTH];
        for (int i = 0; i < randomValues.length; i++) {
            int random = (int) (Math.random() * LENGTH);
            randomValues[i] = random;


        }
        return randomValues;
    }

    public static long getExecutionTimeForLinearSearch(int[] arr, int key) {
        long startTime = System.currentTimeMillis();
        linearSearch(arr, key);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
