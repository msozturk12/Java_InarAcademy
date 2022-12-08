package chapters.mixedExercises.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class E11_14 {
    public static void main(String[] args) {
        Set<Integer> list1 = takeNumbersFromUser(1);
        Set<Integer> list2 = takeNumbersFromUser(2);
        Set<Integer> list3 = union(list1, list2);
        System.out.println("The combined list is ");
        System.out.println(list3);


    }

    private static Set<Integer> union(Set<Integer> list1, Set<Integer> list2) {
        Set<Integer> union = new HashSet<>();
        for (int i = 0; i < list1.size(); i++) {
            union.addAll(list1);

        }

        for (int i = list1.size() - 1; i < list2.size(); i++) {
            union.addAll(list2);

        }
        return union;
    }

    private static Set<Integer> takeNumbersFromUser(int n) {
        Scanner input = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        System.out.println("Enter 5 number for list" + n);
        for (int i = 0; i < 5; i++) {
            set.add(input.nextInt());

        }
        return set;
    }
}
