package chapters.chapter11.Listing11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DistinctNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your numbers(for Exit enter 0)");

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int number = input.nextInt();
            if (number == 0) {
                break;
            }
            if (!list.contains(number)) {
                list.add(number);
            }
        }
        System.out.println("The distinct numbers are:");
        for (Integer number: list) {
            System.out.print(number + " ");

        }
        System.out.println();
        Collections.sort(list);
        System.out.println(list);
    }


}
