package chapters.chapter11.Exercises11.Exercise11_09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise11_09 {
    public static void main(String[] args) {

        int[][] matrix = getMatrixFromUser();
        System.out.println("The random array is ");
        displayArray(matrix);

        ArrayList<Integer> arrListRow = new ArrayList<>();
        ArrayList<Integer> arrListCol = new ArrayList<>();

        findingRowSums(matrix, arrListRow);//there are sums of rows in it
        findingColSums(matrix, arrListCol);

        ArrayList<Integer> largestRow = getLargestRow(arrListRow);
        ArrayList<Integer> largestCol = getLargestCol(arrListCol);

        displayRow(largestRow);
        displayCol(largestCol);


    }

    public static int[][] getMatrixFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array size n");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static void displayArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void findingRowSums(int[][] matrix, ArrayList<Integer> arrListRow) {
        for (int row = 0; row < matrix.length; row++) {
            int sum = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];

            }
            arrListRow.add(sum);
        }
    }

    public static void findingColSums(int[][] matrix, ArrayList<Integer> arrListCol) {
        for (int col = 0; col < matrix.length; col++) {
            int sum = 0;
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][col];

            }
            arrListCol.add(sum);
        }
    }

    public static ArrayList<Integer> getLargestRow(ArrayList<Integer> arrListRow) {
        int max = Collections.max(arrListRow);

        ArrayList<Integer> maxRowIndex = new ArrayList<>();  //max row indexleri tutuyor
        for (int i = 0; i < arrListRow.size(); i++) {
            if (arrListRow.get(i) == max) {
                maxRowIndex.add(i);

            }

        }
        return maxRowIndex;
    }

    public static ArrayList<Integer> getLargestCol(ArrayList<Integer> arrListCol) {
        int max = Collections.max(arrListCol);

        ArrayList<Integer> maxColIndex = new ArrayList<>();
        for (int i = 0; i < arrListCol.size(); i++) {
            if (arrListCol.get(i) == max) {
                maxColIndex.add(i);
            }

        }
        return maxColIndex;
    }

    public static void displayRow(ArrayList<Integer> largestRow) {
        System.out.print("The largest row index : ");
        for (int i = 0; i < largestRow.size(); i++) {
            System.out.print(largestRow.get(i)+", ");
        }
        System.out.println();
    }

    public static void displayCol(ArrayList<Integer> largestCol) {
        System.out.print("The largest column index : ");
        for (int i = 0; i < largestCol.size(); i++) {
            System.out.print(largestCol.get(i) + ", ");
        }
        System.out.println();
    }


}
