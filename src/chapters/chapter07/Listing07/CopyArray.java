package chapters.chapter07.Listing07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        copyReferans();//shadowcopy
        System.out.println("-------------------------");
        copyValueOfArray();//deepcopy
        int[] arr1 = new int[3];
        arr1[0] = 8;
        arr1[1] = 9;
        arr1[2] = 10;

        int[] arr2 = new int[3];
        arr2[0] = 11;
        arr2[1] = 12;
        arr2[2] = 13;

        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        System.out.println(Arrays.toString(arr1));
    }

    public static void copyValueOfArray() {
        int[] arr1 = new int[3];
        arr1[0] = 8;
        arr1[1] = 9;
        arr1[2] = 10;

        int[] arr2 = new int[3];
        arr2[0] = 11;
        arr2[1] = 12;
        arr2[2] = 13;

        System.out.println("arr1[0] -->" + arr1[0]);
        System.out.println("arr2[0] -->" + arr2[0]);
        System.out.println("---------after copy value--------");
        for (int i = 0; i < 3; i++) {
            arr2[i] = arr1[i];

        }
        System.out.println("arr1[0] -->" + arr1[0]);
        System.out.println("arr2[0] -->" + arr2[0]);

    }

    public static void copyReferans() {
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        int[] arr2 = new int[3];
        arr2[0] = 4;
        arr2[1] = 5;
        arr2[2] = 6;

        System.out.println("arr1[0] -->" + arr1[0]);
        System.out.println("arr2[0] -->" + arr2[0]);

        arr2 = arr1;
        System.out.println("After copy referance-------");

        System.out.println("arr1[0] -->" + arr1[0]);
        System.out.println("arr2[0] -->" + arr2[0]);
        System.out.println("arr2[1] -->" + arr2[1]);
        System.out.println("arr2[2] -->" + arr2[2]);//arr1'i gösterio artık
    }


    public static void arrayCopy(int[] arr) {
        int[]source = {3,4,5};
        int[] t = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            t[i] = source[i];
        }

    }
}
