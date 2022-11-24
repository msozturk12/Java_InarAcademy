package chapters.chapter12.Exercises12.Exercises12_06;

import java.util.Scanner;

public class HexToDec1 {
    public static void main(String[] args) {

        while (true) {
            try {
                Scanner input = new Scanner(System.in);

                System.out.println("Enter a hex number");
                String hex = input.nextLine();
                System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
                break;
            } catch (NumberFormatException ex) {
                System.out.println("It is not a hex number ");
                System.out.println(ex.toString());

            }
        }

    }

    public static int hexToDecimal(String hex) {
        for (int i = 0; i < hex.length(); i++) {
            if (!('A' <= hex.charAt(i) && hex.charAt(i) <= 'F') && !('0' <= hex.charAt(i) && hex.charAt(i) <= '9')) {
                throw new NumberFormatException("Your values must be between A-F and 0-9");

            }

        }

        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);

            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);

        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if ('A' <= ch && ch <= 'F') {
            return ch - 'A' + 10;  //A-->10 B-->11 C-->12
        } else {
            return (ch - '0');
        }

    }
}