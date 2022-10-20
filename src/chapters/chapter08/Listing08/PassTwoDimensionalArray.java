package chapters.chapter08.Listing08;

import weeks.week_10.TwoDimensionalArrays;

import java.util.Scanner;

public class PassTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = getArray();
        TwoDimensionalArrays.printArray(arr);
        System.out.println("----------Random Shuffle--------------");
        randomShuffle(arr);
        TwoDimensionalArrays.printArray(arr);
        System.out.println("Sum of all element is :" + sum(arr));


    }

    public static void randomShuffle(int[][] arr) {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                int i1 =(int)(Math.random()*arr.length);
                int j1=(int)(Math.random()*arr[i].length);
                int temp = arr[i][j];
                arr[i][j]=arr[i1][j1];
                arr[i1][j1]=temp;
            }

        }
    }


    public static int[][] getArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your row number");
        int row = input.nextInt();
        System.out.println("Enter your column number");
        int col = input.nextInt();
        int [][] arr=new int[row][col];
        System.out.println("Enter " + arr.length + " row number and " + arr[0].length + " column number");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=input.nextInt();
            }

        }
   return arr;
    }
    public static int sum(int[][] arr) {
        int sum =0;
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                sum+=arr[row][col];

            }

        }
        return sum;
    }

}
