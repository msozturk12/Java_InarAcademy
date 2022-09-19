package chapters.chapter05.Exercises05;

import java.util.Scanner;

public class decimalToHex {

	public static void main(String[] args) {
		/**
		 * decimal bir sayı girilecek--->hex
		 * 1-9 ve 10-15(A-F)
		 *
		 */

		Scanner input= new Scanner(System.in);
		System.out.println("Enter a decimal number");
		int number = input.nextInt();
		String hex="";


		while(number!=0){
			int kalan=number%16;

			if(kalan<10){
				hex= kalan + hex;
			}else{
				char hexdigit = (char)(kalan - 10 + 'A');
				hex=hexdigit+hex;

			}
			number=number/16;

		}
		System.out.println("The hex number is " + hex );

	}

}
