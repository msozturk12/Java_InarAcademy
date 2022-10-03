package chapters.chapter06.Exercises06;

import java.util.Scanner;

public class Exercises_06_20 {
    public static void main(String[] args) {
        /*
        count letters
        123Inar --> 4
        ınar academy -->11
        #$½#$½#$ i love inar academy 1313 -->16
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        int result = countLetters(str);
        System.out.println("Your String is" + " ( " + str + " ) " + "and the number of letter is --> " + result);

    }

    public static int countLetters(String str) {
        int counter = 0;
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() - 1; i++) { //132ınar

            char ch = str.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                counter++;
            }
        }
        return counter;
    }


}
