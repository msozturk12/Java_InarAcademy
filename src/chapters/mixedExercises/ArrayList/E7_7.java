package chapters.mixedExercises.ArrayList;

import java.util.ArrayList;

public class E7_7 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = takeRandomNumbers0To9();
        displayNumbers(numbers);

        int[] count = findTheCountOfDigit(numbers);
        getDisplayOccurrence(count);

    }

    private static ArrayList<Integer> takeRandomNumbers0To9() {
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 10);
            num.add(random);
        }
        return num;
    }

    private static void displayNumbers(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + (((i + 1) % 20 == 0) ? "\n" : " "));

        }
        System.out.println();
    }

    private static int[] findTheCountOfDigit(ArrayList<Integer> numbers) {
        int[] counts = new int[10];
        for (int i = 0; i < numbers.size(); i++) {
            counts[numbers.get(i)]++;

        }
        return counts;
    }

    private static void getDisplayOccurrence(int[] count) {
        for (int i = 0; i < count.length; i++) {
            System.out.println(i + "'s occurrence is " + count[i]);

        }
    }


}
