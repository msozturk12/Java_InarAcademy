package chapters.chapter12.Exercises12.Exercises12_07;

import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a binary number");
            String bin = input.nextLine();
            System.out.println("The decimal value for binary number " + bin + " is " + bin2Dec(bin));

        } catch (NumberFormatException ex) {
            System.out.println("This input not a binary number!");

        }
    }

    public static int bin2Dec(String bin) {

        for (int i = 0; i < bin.length(); i++) {
            char ch = bin.charAt(i);
            if (ch != '0' && ch != '1') {
                throw new NumberFormatException();
            }
        }

        Long number = Long.parseLong(bin);
        int decimalNumber = 0;
        long remainder;
        int p = 0;
        while (number != 0) {
            remainder = number % 10;
            decimalNumber += remainder * Math.pow(2, p);
            number = number / 10;
            p++;

        }

        return decimalNumber;
    }
}
