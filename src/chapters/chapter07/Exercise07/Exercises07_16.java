package chapters.chapter07.Exercise07;

import java.util.Arrays;

public class Exercises07_16 {
    public static void main(String[] args) {

        int[] numbers = getRandomValue();
        int key = getRandomKey();

        long startTime = System.currentTimeMillis();

        int linearIndex = linearSearch(numbers, key);

        long endTime = System.currentTimeMillis();
        long executionTimeForLineaSearch = endTime - startTime;
        System.out.println("Linear index is " + linearIndex);
        System.out.println("Linear search execution time is " + executionTimeForLineaSearch);

        System.out.println("---------------------------------------------------------");

        startTime = System.currentTimeMillis();

        Arrays.sort(numbers);
        int binaryIndex = binarySearch(numbers, key);

        endTime = System.currentTimeMillis();
        long executionTimeForBinarySearch = endTime - startTime;
        System.out.println("Binary index is " + binaryIndex);
        System.out.println("Binary search execution time is " + executionTimeForBinarySearch);


    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] numbers, int key) {// 7 15 26 46 56 96 120 150 210

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
        return (int) (Math.random() * 100_000);
    }

    public static int[] getRandomValue() {
        int[] randomValues = new int[100_000];
        for (int i = 0; i < randomValues.length; i++) {
            int random = (int) (Math.random() * 100_000);
            randomValues[i] = random;


        }
        return randomValues;
    }


}
