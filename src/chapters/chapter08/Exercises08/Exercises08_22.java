package chapters.chapter08.Exercises08;

public class Exercises08_22 {
    /*
            (Even number of 1s) Write a program that generates a 6-by-6 two-dimensional
        matrix filled with 0s and 1s, displays the matrix, and checks if every row and
        every column have an even number of 1s.
     */

    public static void main(String[] args) {
        int[][] matrix = fillTheMatrixWith0And1(6, 6);
        Exercises08_10.printMatrix(matrix);
        checkEven1s(matrix);

    }

    public static int[][] fillTheMatrixWith0And1(int row, int col) {
        int[][] arr = new int[row][col];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 2);

            }
        }
        return arr;
    }

    public static void checkEven1s(int[][] matrix) {
        if (isRowHaveEven1s(matrix) && isColHaveEven1s(matrix)) {
            System.out.println("Every column and row have even 1's");
        } else {
            System.out.println("Every column and row does not have even 1's");
        }
    }

    public static boolean isRowHaveEven1s(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            int counter = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    counter++;
                }

            }
            if (counter % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isColHaveEven1s(int[][] matrix) {
        for (int col = 0; col < matrix[0].length; col++) {
            int counter = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[col][row] == 1) {
                    counter++;
                }
            }
            if (counter % 2 != 0) {
                return false;
            }
        }
        return true;
    }


}