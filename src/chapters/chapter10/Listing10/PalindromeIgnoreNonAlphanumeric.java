package chapters.chapter10.Listing10;

import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = input.nextLine();

        System.out.println( s + " is a palindrom? -->" + isPalindrom(s));
    }

    private static boolean isPalindrom(String s) {

        s = filter(s);
        String reverse = getReverse(s);
        return s.equalsIgnoreCase(reverse);
    }

    private static String getReverse(String s) {
       StringBuilder sb = new StringBuilder();
       sb.append(s);
       return sb.reverse().toString();
    }

    private static String filter(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
