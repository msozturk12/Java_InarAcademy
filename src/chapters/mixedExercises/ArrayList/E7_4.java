package chapters.mixedExercises.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class E7_4 {
    public static void main(String[] args) {
        ArrayList<Double> scores = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers - when you enter negative it ends-");
        double number;
        do {
            number = input.nextInt();
            while (number > 100) {
                System.out.println("Please enter your score less than 100");
                number = input.nextDouble();
            }
            scores.add(number);
        } while (number >= 0);

        scores.remove(scores.size() - 1);
        double average = getAverage(scores);
        displayAboveEqualsBelow(scores, average);


    }

    private static void displayAboveEqualsBelow(ArrayList<Double> scores, double average) {
        int countAbove = 0;
        int countEquals = 0;
        int countBelow = 0;

        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) > average) {
                countAbove++;
            } else if (scores.get(i) == average) {
                countEquals++;
            } else {
                countBelow++;
            }

        }
        System.out.println("Number of score above to the average " + countAbove);
        System.out.println("Number of score equals to the average " + countEquals);
        System.out.println("Number of score below to the average " + countBelow);
    }

    private static double getAverage(ArrayList<Double> score) {
        double sum = 0;
        for (int i = 0; i < score.size(); i++) {
            sum += score.get(i);

        }
        return sum / score.size();
    }


}
