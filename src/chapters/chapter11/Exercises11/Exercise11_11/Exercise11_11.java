package chapters.chapter11.Exercises11.Exercise11_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_11 {
    public static void main(String[] args) {

        ArrayList<Integer> list = getNumbersFromUser();
        sort(list);
        System.out.println(list.toString());

    }

    public static void sort(ArrayList<Integer> list) {
        // Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static ArrayList<Integer> getNumbersFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 number");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int number = input.nextInt();
            list.add(number);
        }
        return list;
    }
}
