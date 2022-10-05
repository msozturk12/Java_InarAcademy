package chapters.chapter06.Exercises06;

import java.net.ServerSocket;
import java.util.Scanner;

public class Exercises_06_23 {
/*
    InarAcademy, a --> 2
    JavaProgramming, m -->2
    AAAınarAcademyAA32, A -->6
    Java academy +%%&, a-->4
     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();

        System.out.println("Enter a character that you want to learn occurrences ");
        char ch = input.nextLine().charAt(0); // ı searched it  in ınternet.
22


        int result = count(str, ch);
        System.out.println("Your string is " + "("+ str + ")" + " and Occurrences of a specified character ->" + result);

    }

    public static int count(String str, char a) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == a) {
                counter++;
            }

        }
        return counter;
    }
}



