package chapters.chapter11.Exercises11.exercise11_14;

import java.util.ArrayList;
import java.util.Scanner;

public class exercise11_14 {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = getNumberFromUser(1);
        ArrayList<Integer> list2 = getNumberFromUser(2);
        ArrayList<Integer> list3 = union(list1, list2);
        System.out.println(list3.toString());
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        for (int i = 0; i < list2.size(); i++) {
            list1.add(list2.get(i));

        }
        return list1;
    }

    public static ArrayList<Integer> getNumberFromUser(int listNum) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five integer for list" + listNum);

        for (int i = 0; i < 5; i++) {
            int number = input.nextInt();
            list.add(number);

        }
        return list;
    }
}
