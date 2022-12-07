package chapters.mixedExercises.Set;

import java.util.*;

public class E7_5 {
    public static void main(String[] args) {
        Set<Integer> numbers = getNumbersFromUser();
        System.out.println("NUmber of distinct numbers-->" + numbers.size());
        System.out.println("The distinct numbers are: ");
        System.out.println(Arrays.toString(numbers.toArray()));

    }


    private static Set<Integer> getNumbersFromUser() {
        Set<Integer> numbers = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers");
        for (int i = 0; i < 10; i++) {
            numbers.add(input.nextInt());

        }
        return numbers;
    }
}

