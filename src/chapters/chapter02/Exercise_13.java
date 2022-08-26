package chapters.chapter02;

import java.util.Scanner;

public class Exercise_13 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the monthly saving amount:");
		double amount = input.nextDouble();
		
		 double rate  = (1 + 0.00417);
		
		double firstMonthValue = amount * rate;
		double secondMonthValue = (amount + firstMonthValue) * rate;
		double thirdMonthValue = (amount + secondMonthValue) * rate;
		double forthMonthValue = (amount + thirdMonthValue) * rate;
		double fifthMonthValue = (amount + forthMonthValue) * rate;
		double sixthMonthValue = (amount + fifthMonthValue) * rate;
		
		System.out.println("After the sixth month, the account value is: " + sixthMonthValue);
				
	}

}


