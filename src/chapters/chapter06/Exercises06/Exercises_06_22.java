package chapters.chapter06.Exercises06;

import chapters.chapter06.Listing06.RandomCharacters;

import java.util.Scanner;

public class Exercises_06_22 {
    public static void main(String[] args) {
        /*
        Babylonian method.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number that you wanna learn the root");
        long n = input.nextLong();

        double result = sqrt(n);
        System.out.println("the root of " + n + " is approximately-->" + result);

    }

    public static double sqrt(long n) {
        long lastGuess = 1;
        long nextGuess = (lastGuess + n / lastGuess) / 2;

        while (nextGuess - lastGuess > 0.0001) {

            lastGuess = nextGuess;                         // n ->5
            nextGuess = (lastGuess + n / lastGuess) / 2; //lastguess=3--> nextguess is -->2,33 olur
            lastGuess=nextGuess;                            //lastguest=2,3333
            nextGuess = (lastGuess + n / lastGuess) / 2; //nextguess=2,237

        }

        return nextGuess;
    }

}