package chapters.chapter06.Exercises06;

import java.util.Scanner;

public class Exercises_06_18 {
    public static void main(String[] args) {

        /*
        string
        1-password must have at least 8 character-->metod boolean length=8
        2-only letter and digit  -->contains ch and digit
        3-must contain at least two digit -->en az 2 digit
        1 2 3 saglarsa valid password
        Inar32--> false
        InarAcademy32 -->true
        &/&%%4(ınar -->false
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password");
        String password = input.nextLine();


        System.out.print("your password is " + password + "  --->  " + "and it is ");
        System.out.println(checkPassword(password) ? "Valid password" : "Invalid Password");

    }

    public static boolean checkPassword(String str) {
        return (is8Character(str) && isOnlyContainsLetterAndDıgıt(str) && isHave2Digit(str));

    }

    public static boolean is8Character(String str) {
        return str.length() >= 8;
    }

    public static boolean isOnlyContainsLetterAndDıgıt(String str) {
        str = str.toLowerCase(); //inarAcademy32

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!('a' <= ch && ch <= 'z') || ('0' <= ch && ch <= '9')) {
                return false;
            }
        }
        return true;
    }

    public static boolean isHave2Digit(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('0' <= ch && ch <= '9') {
                counter++;
            }
            if (counter >= 2) {
                return true;
            }

        }
        return false;

    }

}
