package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ınteger for take its factor ");
		int number = input.nextInt();

		int divisor = 2;
		String output = "";

		while (number != 1) {

			if (number % divisor == 0) {
				number = number / divisor;
				output+=divisor + "," ;
			} else {
				divisor++;
			}
			
		}
		
		System.out.println(output);
	}

}
