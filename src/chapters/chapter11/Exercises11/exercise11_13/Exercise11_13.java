package chapters.chapter11.Exercises11.exercise11_13;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getNumberFromUser();
        removeDuplicate(list);
        displayList(list);

    }

    private static void displayList(ArrayList<Integer> list) {
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i) + " ");

        }
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
       while(!list.isEmpty()){
           int n = list.remove(0);
           if(!result.contains(n)){
               result.add(n);
           }
       }
    list.addAll(result);
    }

    public static ArrayList<Integer> getNumberFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 number");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();
            list.add(number);


        }
        return list;
    }
}
