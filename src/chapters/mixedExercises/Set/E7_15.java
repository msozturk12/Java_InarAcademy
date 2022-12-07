package chapters.mixedExercises.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class E7_15 {
    public static void main(String[] args) {
        Set<Integer> numbers = takeNumberFromsUsers();
        System.out.println("Distinct numbers are :");
        System.out.println(numbers.toString());
    }

    private static Set<Integer> takeNumberFromsUsers() {
        Set<Integer> numbers = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            numbers.add(input.nextInt());

        }
        return numbers;
    }
}
