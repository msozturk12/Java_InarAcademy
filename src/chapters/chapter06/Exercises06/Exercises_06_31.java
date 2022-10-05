package chapters.chapter06.Exercises06;

import java.util.Scanner;

public class Exercises_06_31 {
    public static void main(String[] args) {

        /*
            Financial: credit card number validation)

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer: ");
        long number = input.nextLong();

        if (isValid(number)) {
            System.out.println(number + " is valid");
        } else {
            System.out.println(number + " is invalid");
        }


    }

    /**
     * Return true if the card number is valid
     */
    public static boolean isValid(long number) {
        int sumOfAll = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        return (13 <= getSize(number) && getSize(number) <= 16) &&
                (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                        prefixMatched(number, 37) || prefixMatched(number, 6)) &&
                (sumOfAll % 10 == 0);


    }

    /**
     * Double every second digit from right to left. If doubling of a digit results in a
     * two-digit number, add up the two digits to get a single-digit number.
     * ex.4388576018402626
     * Get the result from Step 2
     */
    public static int sumOfDoubleEvenPlace(long number) {
        String num = number + "";
        int sum = 0;
        for (int i = num.length() - 2; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt( num.charAt(i) + "") * 2);//String to int

        }
        return sum;
    }

    /**
     * Return this number if it is a single digit, otherwise,
     * return the sum of the two digits
     */
    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        }else{
            return number /10 + number % 10;
        }



    }

    /**
     * Return sum of odd-place digits in number
     */
    public static int sumOfOddPlace(long number) {
        String num = number + "";
        int sum = 0;
        for (int i = num.length() - 1; i >= 0; i -= 2) {
            sum += Integer.parseInt( num.charAt(i) + "");
        }
        return sum;

    }

    /**
     * Return true if the digit d is a prefix for number
     */
    public static boolean prefixMatched(long number, int d) {
        String temp = number + "";
        return getPrefix(number, getSize(d)) == d;
    }

    /**
     * Return the number of digits in d
     */
    public static int getSize(long d) {
        String len = d + "";
        return len.length();
    }

    /**
     * Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number.
     */
    public static long getPrefix(long number, int k) {
        String str = number + "";
        if (getSize(number) < k) {
            return number;
        }
        return Long.valueOf(str.substring(0, k));//String to long

    }


}