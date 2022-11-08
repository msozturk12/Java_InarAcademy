package chapters.chapter10.Exercises10.Exercise10_05;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {

        int number = getNumberFromUser();

        StackOfIntegers stack = findPrimeFactor(number);
        displayFactorReversed(stack);


    }

    private static void displayFactorReversed(StackOfIntegers stack) {

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    private static int getNumberFromUser() {
        Scanner input = new Scanner(System.in);
        int number = -1;
        do {
            System.out.println("Enter a  positive number to find prime factors");
            number = input.nextInt();

        } while (number <= 0);
        return number;
    }

    private static StackOfIntegers findPrimeFactor(int number) {
        StackOfIntegers stack = new StackOfIntegers();
        int primeFactor = 2;

        while (number != 1) {
            if (isPrime(primeFactor)) {
                while (number % primeFactor == 0) {
                    stack.push(primeFactor);
                    number /= primeFactor;
                }
            }
            primeFactor++;
        }
        return stack;
    }

    private static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }


}
