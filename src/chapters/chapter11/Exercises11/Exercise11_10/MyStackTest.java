package chapters.chapter11.Exercises11.Exercise11_10;

import java.util.ArrayList;
import java.util.Scanner;

public class MyStackTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyStack stack = new MyStack();

        for (int i = 0; i <5 ; i++) {
            System.out.print("Enter a string:");
            String s = input.nextLine();
            stack.push(s);
        }

        System.out.println(stack.toString());
        System.out.println("------------------------------------------");
        while(!stack.isEmpty()){
            System.out.println(stack.pop() + " ");
        }


    }
}
