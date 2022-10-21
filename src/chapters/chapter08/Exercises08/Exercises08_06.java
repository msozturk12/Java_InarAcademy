package chapters.chapter08.Exercises08;

public class Exercises08_06 {
    public static void main(String[] args) {

        double[][] matrix1 = Exercises08_05.getMatrix(3, 3, 1);
        double[][] matrix2 = Exercises08_05.getMatrix(3, 3, 1);

        double[][] result = multiplyMatrix(matrix1, matrix2);
        displayPattern(matrix1, matrix2, result);

    }

    public static void displayPattern(double[][] matrix1, double[][] matrix2, double[][] result) {
        for (int i = 0; i < matrix1.length; i++) {
            printRow(matrix1, i);
            System.out.print(i == 1 ? "   *   " : "       ");
            printRow(matrix2, i);
            System.out.print(i == 1 ? "   =   " : "       ");
            printRow(result, i);
            System.out.println();

        }

    }

    public static void printRow(double[][] arr, int row) {
        for (int j = 0; j < arr.length; j++) {
            System.out.printf("%-5.1f ",arr[row][j]); //0,0 0,1 0,2....
        }
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] multiply = new double[a.length][a[0].length];

        for (int i = 0; i < multiply.length; i++) {
            for (int j = 0; j < multiply[i].length; j++) {                 // ai1 * b1j + ai2 * b2j + ai3 * b3j
                multiply[i][j] = (a[i][0] * b[0][j]) + (a[i][1] * b[1][j]) + (a[i][2] * b[2][j]);

            }
        }
        return multiply;
    }
}
