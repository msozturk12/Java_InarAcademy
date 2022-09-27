package weeks.week_07;

import java.util.Scanner;

public class isPresentInNewString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first string ");
        String s1 = input.nextLine();
        System.out.println("Enter your second string ");
        String s2 = input.nextLine();

        System.out.println(isPresentInNewString(s1, s2));

    }

    public static String isPresentInNewString(String s1, String s2) {

        String output = "";
        boolean exist = true;

        for (int i = 0; i < s1.length(); i++) {           //inar academy --- sinan   -->r cdemy
            for (int j = 0; j < s2.length(); j++) {

                if (s1.charAt(i) == s2.charAt(j)) {
                    exist = false;
                    break;

                } else {
                    exist = true;

                }
            }
            if (exist == true) {
                output += s1.charAt(i);
            }


        }
        return output;
    }


}
