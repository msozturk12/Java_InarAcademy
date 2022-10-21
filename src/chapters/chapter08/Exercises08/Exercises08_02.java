package chapters.chapter08.Exercises08;

public class Exercises08_02 {
    public static void main(String[] args) {
        /*
        sum all the major diagonal [0],[0] + [1],[1] + [2],[2]+ [3],[3]

         */
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        double[][] matrix = new double[4][4];
        Exercises08_01.fillTheArray(matrix);
        double sumMajorDiagonal = sumMajorDiagonal(matrix);
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal);
    }

    public static double sumMajorDiagonal(double[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
}
