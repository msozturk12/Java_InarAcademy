package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_37 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("---Decimal to binary---");
		
		System.out.println("\nEnter a decimal value ");
		int dec = input.nextInt();

		String output = "";
		
		while (dec > 0) {

			output += (dec % 2);

			dec = dec / 2;

		}

		for (int i = output.length() - 1; i >= 0; i--) {
			
			System.out.print(output.charAt(i));  
		
		}
	
	
	}

}
