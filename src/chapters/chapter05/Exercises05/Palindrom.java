package chapters.chapter05.Exercises05;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {

        /**
         * Ex.->mom,dad,noon,civic
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String s = input.nextLine();
        boolean isPalindrom = true;

        for (int i = 0; i < (s.length() - 1) / 2; i++) {

            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrom = false;
            }
        }
        if (isPalindrom) {
            System.out.println(s + " is a palindrom");
        } else {
            System.out.println(s + " is not a palindrom");
        }


    }

}
