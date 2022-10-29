package weeks.week_10;

import java.util.Scanner;

public class TwoDimensionalArrays {
    public static void main(String[] args) {



        int[][] array = getRowAndColonLengthFromUsers();
        fillArray(array);
        printArray(array);
        System.out.println("--------------------------------");
        fill2DArrayWithRandomValue(array, 0, 101);
        printArray2(array);
        // int[][] arr = new int[2][5];
        //   printArray(arr);
      /*
        System.out.println("-----------------");
        System.out.println("arr.length --> " + arr.length);
        System.out.println("arr[0].length --> " + arr[0].length);
        System.out.println("arr[1].length --> " + arr[1].length);
       */
    }

    public static int[][] getRowAndColonLengthFromUsers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rows number of array");
        int row = input.nextInt();
        System.out.println("Enter columns number of array");
        int colon = input.nextInt();
        int[][] arr = new int[row][colon];
        return arr;
    }


    public static void fillArray(double [][] arr){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array");
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col]=input.nextDouble();
            }

        }
    }
    public static void fillArray(int [][] arr){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array");
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col]=input.nextInt();
            }

        }
    }
    public static void fill2DArrayWithRandomValue(int[][] array, int start, int limit) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                int random = (int) (start + Math.random() * (limit - start));
                array[i][j] = random;
            }

        }
    }
    public static void printArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("[%5.3f]", array[i][j]);

            }
            System.out.println();
        }

    }
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("[%3d] ", array[i][j]);

            }
            System.out.println();
        }

    }
    public static void printArray2(int[][] array){
        for (int[] arr:array){
            for (int i : arr) {
                System.out.printf("[%3d] ",i);
            }
            System.out.println();
        }

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
}
