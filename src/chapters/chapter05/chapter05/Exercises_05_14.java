package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your first integer ");
		int n1 = input.nextInt();

		System.out.println("Enter your second integer");
		int n2 = input.nextInt();


		int gcd;                     
										//int gcd = n1 < n2 ? n1 : n2;
		if(n1<n2) {
			gcd=n1;
		}else {
			gcd=n2;
		}

		
		while (n1 % gcd != 0 && n2 % gcd != 0) {
			gcd--;

		}

	System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
	}
}
