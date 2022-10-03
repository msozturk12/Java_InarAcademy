package chapters.chapter05.Exercises05;

import java.util.Scanner;

public class decimalToHex {

    public static void main(String[] args) {
        /**
         * decimal bir sayı girilecek--->hex
         * tekrar kalan<0 dek while
         * decimal%16=kalan
         * 			eger kalan 1-9 arasında
         * 			ya da 10-15 ABCDEF char i-10 + 'A'
         * 		number=number/16
         * 1-9 ve 10-15(A-F)
         *
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal to hex value");
        int number = input.nextInt();
        int number2=number;
        String hex = "";


        while (number != 0) {

           int kalan = number % 16;

            if (1 <= kalan && kalan <= 9) {

                hex = kalan + hex;
            }else{
                hex = (char)(kalan - 10 + 'A') + hex;
            }

            number = number / 16;


        }

        System.out.println("the HexValue of " + number2 + " is " + hex);

    }
}
