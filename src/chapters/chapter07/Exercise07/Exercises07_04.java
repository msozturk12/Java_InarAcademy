package chapters.chapter07.Exercise07;

import java.util.Scanner;

public class Exercises07_04 {
    /*
       -read unspecified number of score
       -determines how many score are above or equals to the average and (above,equals,below)
       -For end the input use negative number
       -assume that max number of score -> 100
         */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] scores = new int[100];
        System.out.println("Enter numbers - when you enter negative it ends-");
        int number;
        int numberOfScore = 0;
        int average = 0;
        int sum = 0;

        do {
            number = input.nextInt();
            scores[numberOfScore] = number;
            numberOfScore++;
            sum += number;

        } while (number > 0);
        average = sum / numberOfScore;

        displayAboveEqualsAndBelowScoreToTheAverage(scores, average,numberOfScore);
    }

    public static void displayAboveEqualsAndBelowScoreToTheAverage(int[] arr, int average,int numberOfScore) {
        int above = 0;
        int equals = 0;
        int below = 0;

        for (int i = 0; i < numberOfScore; i++) {
            if (arr[i] > average) {
                above++;
            } else if (arr[i]< average) {
                below++;
            } else if (arr[i] == average) {
                equals++;
            }

        }
        System.out.println("Number of score above to the average " + above);
        System.out.println("Number of score equals to the average " + equals);
        System.out.println("Number of score below to the average " + below);
    }
}
