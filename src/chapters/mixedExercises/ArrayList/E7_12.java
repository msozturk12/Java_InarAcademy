package chapters.mixedExercises.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class E7_12 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = take10NumbersFromUser();
        getReverse(numbers);
    }

    private static void getReverse(ArrayList<Integer> numbers) {
        for (int i = numbers.size()-1; i >=0 ; i--) {
            System.out.print(numbers.get(i) + " ");

        }
    }

    private static ArrayList<Integer> take10NumbersFromUser() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers");
        for (int i = 0; i < 10; i++) {
           int num = input.nextInt();
            numbers.add(num);
        }
        return numbers;

    }
}
