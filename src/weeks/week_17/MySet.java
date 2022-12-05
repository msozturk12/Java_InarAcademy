package weeks.week_17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MySet {
    /**
     * 1-Set can only store Object
     * 2-Set can only store unique values
     * 3-Set does store the values in random order
     * @param args
     */
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        addRandomValueToTheList(set,5);

        printSet(set);
    }

    private static void printSet(Set<Integer> set) {
        System.out.println(Arrays.toString(set.toArray()));
    }

    private static void addRandomValueToTheList(Set<Integer> set,int size) {

        for (int i = 0; i < size; i++) {
            int number = (int)(Math.random()*10);
            set.add(number);
            System.out.println(number + " Number is added to the set");

        }

    }
}
