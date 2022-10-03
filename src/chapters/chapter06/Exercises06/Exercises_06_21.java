package chapters.chapter06.Exercises06;

import java.util.Scanner;

public class Exercises_06_21 {

    public static void main(String[] args) {
        /*
        phone keypad
        4214flowers -->42143569377
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();


        System.out.print("your phone keypad is --> ");
        phoneNumber(str);
    }


    public static void phoneNumber(String str) {
        String output = "";
        str = str.toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('0' <= ch && ch <= '9') {
                output += ch;
            }
            if ('A' <= ch && ch <= 'Z') {
                output += getNumber(ch);
            }
        }
        System.out.println(output);
    }

    public static int getNumber(char uppercaseLetter) {

        if ('A' <= uppercaseLetter && uppercaseLetter <= 'C')
            return 2;
        else if ('D' <= uppercaseLetter && uppercaseLetter <= 'F')
            return 3;
        if ('G' <= uppercaseLetter && uppercaseLetter <= 'I')
            return 4;
        else if ('J' <= uppercaseLetter && uppercaseLetter <= 'L')
            return 5;
        else if ('M' <= uppercaseLetter && uppercaseLetter <= 'O')
            return 6;
        else if ('P' <= uppercaseLetter && uppercaseLetter <= 'S')
            return 7;
        else if ('T' <= uppercaseLetter && uppercaseLetter <= 'V')
            return 8;
        else {
            return 9;
        }


    }

}
