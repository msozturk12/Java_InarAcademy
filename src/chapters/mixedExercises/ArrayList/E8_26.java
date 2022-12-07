package chapters.mixedExercises.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class E8_26 {
    public static void main(String[] args) {
        List<List<Double>> matrix = new ArrayList<>();

        takeNumbersToMatrixFromUser(matrix);
        sort(matrix);
        print(matrix);
    }

    private static void takeNumbersToMatrixFromUser(List<List<Double>> matrix) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row");
        for (int i = 0; i < 3; i++) {
            matrix.add(new ArrayList<>());
            for (int j = 0; j < 3; j++) {
                double number = input.nextDouble();
                (matrix.get(i)).add(number);

            }
        }
    }

    private static void sort(List<List<Double>> matrix) {
        for (int i = 0; i < matrix.size(); i++) {
            Collections.sort(matrix.get(i));

        }
    }

    private static void print(List<List<Double>> matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix.get(i).get(j) + " ");

            }
            System.out.println();
        }
    }


}
