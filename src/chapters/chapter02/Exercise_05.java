package chapters.chapter02;

import java.util.Scanner;

public class Exercise_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the subtotal and a gratuity rate: ");

		double subtotal = input.nextDouble();
		double gratuityrate = input.nextDouble();

		double gratuity = gratuityrate /100 * subtotal;
		double total = subtotal + gratuity;
		System.out.println("The gratuity is : $" + gratuity + " and total is $" + total);
	}
}
