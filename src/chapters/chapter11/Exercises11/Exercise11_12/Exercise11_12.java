package chapters.chapter11.Exercises11.Exercise11_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_12 {
    public static void main(String[] args) {
        ArrayList<Double> list = getNumberFromUser();
        double sum = sum(list);
        System.out.println("Sum of the number is-->" + sum);


    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    private static ArrayList<Double> getNumberFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 number");
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            double number = input.nextDouble();
            list.add(number);
        }
        return list;
    }
}
