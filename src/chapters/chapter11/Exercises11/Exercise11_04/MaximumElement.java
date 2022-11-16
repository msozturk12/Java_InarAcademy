package chapters.chapter11.Exercises11.Exercise11_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = getNumbersFromUser();

        Integer max = max(list);
        System.out.println("The largest number in the input is--> " + max);

    }

    public static ArrayList<Integer> getNumbersFromUser() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();

        System.out.println("Enter your numbers (for ending enter 0)");
        int number;
        do {
            number = input.nextInt();
            result.add(number);

        } while (number != 0);
        return result;
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        return Collections.max(list);

    }
}