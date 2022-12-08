package chapters.mixedExercises.Map;

import java.util.*;

public class E21_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println("Enter a number of integer(when enter 0 it ends)");
        int number;
        do {
            number = input.nextInt();

            if (!map.containsKey(number)) {
                map.put(number, 1);
            } else {
                int occurrence = map.get(number);
                map.put(number, occurrence + 1);

            }


        } while (number != 0);

        displayOccurrences(map);
    }

    private static void displayOccurrences(Map<Integer, Integer> map) {
        System.out.println("The most occurrences integers are: ");
        int max = Collections.max(map.values());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey() + " ");

            }
        }
        System.out.println();
    }
}