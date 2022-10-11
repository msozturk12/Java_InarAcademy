package chapters.chapter07.checkPoint07;

import java.util.Arrays;

public class CheckPoint07_08 {

    public static void main(String[] args) {
        double[] arr = new double[10]; //a
        arr[arr.length - 1] = 5.5;     //b
        sumOfTwoElement(arr);          //c
        System.out.println(Arrays.toString(arr));
        sumOfAllElement(arr);          //d
        findTheMinimum(arr);           //e
        randomIndex(arr);              //f
        double[] list = {3.5,5.5,4.52,5.6};


    }

    private static void randomIndex(double[] arr) {
        int r = (int)(Math.random()) * arr.length;
        System.out.println(arr[r]);
    }

    public static void findTheMinimum(double[] arr) {
       double min=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }

        }
    }

    public static void sumOfAllElement(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
    }

    private static double sumOfTwoElement(double[] arr) {
        double sum = 0;
        for (int i = 0; i < 2; i++) {
            sum += arr[i];

        }
        return sum;
    }
}
