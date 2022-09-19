package weeks.week_05;

import java.util.Scanner;

public class SubstractionQuizLoopp {
    public static void main(String[] args) {




        /**
         * five times sunstraction question
         * count correct answer
         * count wrong answer
         * the total question count=5
         * secondcount
         * one question for each run -dif questions
         */
        Scanner input = new Scanner(System.in);
        int correctCount = 0;
        int wrongCount=0;
        int counter = 0;
        String output = "";

        long startTime = System.currentTimeMillis();


        while (counter < 5) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);


            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            int result = number1 - number2;
            System.out.printf("What is the result of %d - %d = ?", number1, number2);
            int answer = input.nextInt();

            if (result== answer) {
                System.out.println("well done");
                correctCount++;
            } else {
                System.out.println("false");
                wrongCount++;


            }
            counter++;

            output += "\n" + number1 + " - " + number2 + " = " + answer + ((number1 - number2 == answer) ? " correct" : " wrong");

        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("The number of your corrects--> " + correctCount);
        System.out.println("The number of your wrongs--> " + wrongCount);
        System.out.println("the test time is " + totalTime / 1000 + " seconds");
        System.out.println(output);
    }
}