package chapters.chapter08.Exercises08;

import weeks.week_10.TwoDimensionalArrays;

public class Exercises08_16 {
    public static void main(String[] args) {
        /*
        -take 2D array
        -sort    -first sort rows
                 -second sort col
         ex.-->{{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
                will be sorted to
                {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
         */

        int[][] arr = TwoDimensionalArrays.getRowAndColonLengthFromUsers();
        TwoDimensionalArrays.fillArray(arr);
        System.out.println("Before sort");
        printArr(arr);
        System.out.println("\nAfter sorted");
        sort(arr);
        printArr(arr);


    }



    /*
             ex.-->{{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
                    will be sorted to
                    {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
     */
    public static void sort(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min0 = arr[i][0];
            int min1 = arr[i][1];
            int minIndex=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j][0]<min0 || (arr[j][1]<min1 && arr[j][0] ==min0)){
                    min0=arr[j][0];
                    min1=arr[j][1];
                    minIndex=j;
                }

            }
            if(minIndex!=i){
                arr[minIndex][0]=arr[i][0];
                arr[minIndex][1]=arr[i][1];
                arr[i][0]=min0;
                arr[i][1]=min1;
            }
        }
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(arr[i][j] + " ");

            }
            System.out.print("    ");
        }
    }
}
