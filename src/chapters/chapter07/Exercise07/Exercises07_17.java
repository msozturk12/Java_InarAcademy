package chapters.chapter07.Exercise07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises07_17 {
    public static void main(String[] args) {
        /*
              Sort Student
        -prompts to user to enter the number of student
            -students name
            -their scores
        -print student names in decreasing order of their scores

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of student ");
        int numberOfStudent = input.nextInt();
        input.nextLine();

        String[] names = new String[numberOfStudent];
        getNamesOfStudent(names, input);

        int[] scores = new int[numberOfStudent];
        getScores(scores,input);

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(scores));

        sortDecreasingOrderTheNames(names, scores);
        printNames(names, scores);


    }

    public static void printNames(String[] names, int[] scores) {
        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[i] + "--> " + scores[i] + " points");
        }
    }

    public static void sortDecreasingOrderTheNames(String[] names, int[] scores) {

        for (int i = 0; i < scores.length; i++) {   //50 80 90  //esad , derda , ali
            int maxScore = scores[i];
            int maxIndex=i;
            String temp="";

            for (int j = i + 1; j < scores.length; j++) {
                if (maxScore < scores[j]) {
                    maxScore = scores[j];
                    maxIndex=j;

                }

            }
        if(maxIndex!=i){
            temp=names[i];
            names[i]=names[maxIndex];
            names[maxIndex]=temp;

            scores[maxIndex]=scores[i];
            scores[i]=maxScore;
        }


        }


    }

    public static void getScores(int[] scores,Scanner input){
        System.out.println("Enter scores :");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }
    }

    public static void getNamesOfStudent(String[] names, Scanner input) {
        System.out.println("Enter names :");
        for (int i = 0; i < names.length; i++) {
            names[i] = input.nextLine();

        }

    }
}
