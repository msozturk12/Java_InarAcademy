package chapters.chapter11.Exercises11.exercise11_16;

import java.util.ArrayList;
import java.util.Scanner;

public class exercise11_16 {
    public static void main(String[] args) {

        ArrayList<Integer> answers = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        int answer = -1;
        int count = 0;
        while (number1 + number2 != answer && count < 5) {
            System.out.println(number1 + " + " + number2 + " = ?");
            answer = input.nextInt();
            if (number1 + number2 != answer) {
                System.out.println("Wrong answer try again please");
            } else {
                System.out.println("Well done you got it");
            }
            answers.add(answer);
            count++;
            if (count == 5) {
                System.out.println("You tried 5 time and you didn't know...sorry the end");
            }

        }

        System.out.println("your answers are--> " + answers);

    }
}
