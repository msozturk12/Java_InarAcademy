package chapters.chapter06.Listing06;

import java.util.Scanner;

public class HexToDec {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a hex number");
        String hex = input.nextLine();
        System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));


    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);

            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);

        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if ('A' <= ch && ch <= 'F') {
            return ch - 'A' + 10;  //A-->10 B-->11
        } else {
            return (ch - '0');
        }

    }
}