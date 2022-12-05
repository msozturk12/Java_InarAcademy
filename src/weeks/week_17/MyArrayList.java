package weeks.week_17;

import java.util.*;

public class MyArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        fillWithRandomNumbers(list, 15);
        printArr(list);
        System.out.println("\nThe smallest number in the list is--> " + findMin(list));
        System.out.println("The index of smallest number--> " + findMinIndex(list));
        noDuplicate(list);

    }

    private static void noDuplicate(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));

        }
        //set.addAll(list);
        System.out.println("No duplicate form of list :\n" + Arrays.toString(set.toArray()));
    }

    public static void printArr(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }

    public static void fillWithRandomNumbers(List list, int size) {
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * 15));

        }
    }

    public static Integer findMin(List list) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (min > (int) list.get(i)) {
                min = (int) list.get(i);
            }
        }
        return min;
    }


    public static Integer findMinIndex(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        int indexMin = -1;
        for (int i = 0; i < list.size(); i++) {
            if (min > (list.get(i))) {
                min = list.get(i);
                indexMin = i;

            }


        }
        return indexMin;
    }
}