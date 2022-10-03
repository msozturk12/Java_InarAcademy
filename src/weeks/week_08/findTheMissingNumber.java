package weeks.week_08;

import java.util.Scanner;

public class findTheMissingNumber {
    public static void main(String[] args) {
/*
        /*
        Size verilen sayı degerlerinde eksik olan bir sayıyı bulunuz
        86 84 82 83 -->85
        1 5 7 6 8 2 9 4 -->3

        -En küçük sayıyı bul
        -tek tek artirarak arra de var mı diye baktım olmayanı buldum

        1 2 3 4 --> 0 ya da 5

         */
        System.out.println("Please enter the size of the array you want to work with");
        Scanner input = new Scanner(System.in);
        int arrSize=input.nextInt();
        int [] arr = new int [arrSize];
        getNumbersFromUser(arr);
        int min = getMinNumber(arr);
        int result1 = findTheMissingNumber(arr, min);
        int result2= findTheMissingNumber2(arr, min);

        System.out.println("The missing number is --> " + result1);
        System.out.println("-----------------");
        System.out.println("The missing number is --> " + result2);
    }

    public static int findTheMissingNumber2(int[] arr, int min) {
        int sum = getSumOfAllNumber(arr);
        int max=min + arr.length;
        int maxSum = max * (max + 1)/2;
        int minSum = min * (min -1)/2;
        int result=maxSum - minSum - sum;
        return result;


    }

    private static int getSumOfAllNumber(int[] arr) {
        int sum =0;
        for(int num : arr){
            sum += num;
        }
        return sum;
    }


    public static int findTheMissingNumber(int[] arr, int num) {   //86 84 82 83 -->85
        int min = num;
        while (num <= min + arr.length) {
            boolean isFound = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                num++;
            } else {
                return num;
            }

        }
        return num;
    }

    public static void getNumbersFromUser(int[] arr) {
        System.out.printf("Please enter %d integer:\n", arr.length);
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {

            arr[i] = input.nextInt();
        }

    }

    public static int getMinNumber(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            min = num < min ? num : min;
        }
        return min;
    }
}
