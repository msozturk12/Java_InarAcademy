package weeks.week_17;

import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        getRandomNumbers(list, 15);
        printList(list);
        System.out.println("\n------------------------");
        printUniq(list);


    }

    public static void ListMethods() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(78);
        list.add(7);
        list.size();
        list.set(0, 8);
        list.clear();
        System.out.println(list.contains(7));
        list.isEmpty();
        list.toArray();
        list.remove(2);

    }

    public static void printUniq(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));

        }
        //set.addAll(list);
        System.out.println("Unique list is " + Arrays.toString((set.toArray())));
        System.out.println("There are " + (list.size() - set.size()) + " duplicate values");
    }

    private static void printList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    private static void getRandomNumbers(List list, int size) {
        for (int i = 0; i < size; i++) {
            int number = (int) (Math.random() * 15);
            list.add(number);
        }
    }


}
