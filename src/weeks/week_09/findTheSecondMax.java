package weeks.week_09;

import java.lang.reflect.Array;
import java.util.Arrays;

public class findTheSecondMax {

    public static void main(String[] args) {
        findTheSecondMax();

    }

    private static void findTheSecondMax() {

        int[] arr = new int[10];
        fillTheArrayRandomValue(arr);
        int num=getSecondMaxNUmber(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("second max value " + num);


    }

    private static int getSecondMaxNUmber(int[] arr) {
        int max = getMaxNumber(arr);
        int secondMax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (secondMax < arr[i] && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    private static int getMaxNumber(int[] arr) {
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    private static void fillTheArrayRandomValue(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int random = (int) (Math.random() * 100);
            arr[i] = random;

        }
    }
}
