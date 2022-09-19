package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of student");
        int numberOfStudent = input.nextInt();

        int maxScore = 0;
        int secondScore = 0;
        String maxScoreName = "";
        String secondScoreName = "";

        int i = 0;
        while (i < numberOfStudent) {
            input.nextLine();    //2 isimli ad girilirse
            System.out.println("Enter the name of student");
            String name = input.nextLine();

            System.out.println("Enter the score of " + name);
            int score = input.nextInt();
            i++;
            if (score > maxScore) {
                secondScore = maxScore;
                secondScoreName = maxScoreName;
                maxScore = score;
                maxScoreName = name;


            } else if (score > secondScore) {
                secondScore = score;
                secondScoreName = name;
            }
        }
        System.out.println("the student with the highest score-->  " + maxScoreName + " the score is--> " + maxScore);
        System.out.println("the student with the second-highest score-->  " + secondScoreName + " the score is--> " + secondScore);
    }

}
