package weeks.week_09;

import java.util.Arrays;

public class Exercise01 {
    public static void main(String[] args) {

        int[] arr1 = new int[5];
        arr1[0] = 4;
        arr1[2] = 7;

        printArray(arr1);
        boolean[] bArr = new boolean[3];
        printArray(bArr);

        char[] ch = new char[2];
        printArray(ch);

        String [] str = new String[3];
        printArray(str);

        printArray(bArr);

    }



    public static void secondSection(){
        int [] bArr ={3,5,6};
        int len = bArr.length;
        printArray(bArr);

    }
    public static void printArray(int[] arr1) {
        for (int num : arr1) {
            System.out.print(num + " ");

        }
    }

    public static void printArray(boolean[] arr1) {
        for (boolean n :arr1) {
            System.out.print( n + " ");

        }

    }

    public static void printArray(char[] arr1) {
        System.out.println(Arrays.toString((arr1)));
    }
    public static void printArray(String[] arr1) {
        System.out.println(Arrays.toString((arr1)));
    }

}