package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Loan amount: ");
		double loanAmount = input.nextDouble();
		
		System.out.println("Enter number of years:");
		int years = input.nextInt();
		
		System.out.println("Interest Rate		Monthly Payment		Total Payment");
		
		
		
		
		for(double i = 5 ; i <= 8 ; i += 0.125) {
			
			double interestRate=i/1200;
			double monthlyPayment = loanAmount * interestRate / (1
					 - 1 / Math.pow(1 + interestRate, years * 12));
			
			double totalPayment = monthlyPayment * years * 12;
			
			System.out.printf("%-5.3f%c			%-6.2f			%-8.2f\n" , i , '%',monthlyPayment,totalPayment);
			
			
		}
		
	}

}
