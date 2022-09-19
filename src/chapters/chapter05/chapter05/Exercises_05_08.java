package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_08 {

    public static void main(String[] args) {
        /**    enter the number of student
         *		 each students name and score---->tekrar eden unsur
         * student name who take highest score
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of student ");
        int numberOfStudent = input.nextInt();


        int maxScore = 0;
        String maxScoreName = "";
        int i = 0;

        while (i < numberOfStudent) {
            System.out.println("Enter the name of student ");
            String name = input.next();

            System.out.println("Enter the score of " + name);
            int score = input.nextInt();


            if (score > maxScore) {
                maxScore = score;
                maxScoreName = name;
            }

            i++;
        }
        System.out.println("the name  of the student with the highest score is " + maxScoreName + " with the score of " + maxScore);

    }

}
