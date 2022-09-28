package chapters.chapter06.Exercises06;

import java.util.Scanner;

public class Exercises_06_04 {
    public static void main(String[] args) {
        /*
        Display an integer reverse
        in method it will be String reversed="";
        ex-->ınar -->ranı son karakterden başlayıp başa doğru yazdıracak (for loop)
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to reverse it ");
        int number = input.nextInt();

        System.out.print("Your number is " + number + " and " + "reversed form of your number --> ");
        reverse(number);
    }

    public static void reverse(int num) {
        String temp = num + "";
        String reversed = "";

        for (int i = temp.length() - 1; i >= 0; i--) {

            reversed += temp.charAt(i);

        }
        System.out.println(reversed);
    }

}
