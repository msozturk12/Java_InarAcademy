package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_22 {

	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter loan amount ");
		double loanAmount = input.nextDouble();
		double balance = loanAmount;
		
		System.out.println("Enter number of years:");
		int numberOfYears=input.nextInt();
		
		System.out.println("Enter annual ınterest rate");
		double annualInterestRate =input.nextInt();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		
		double monthlyPayment = loanAmount * monthlyInterestRate / (1
				 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		System.out.printf("Monthly payment: %6.2f \n" , monthlyPayment);
		System.out.printf("Total payment : %.2f\n " , totalPayment);
		
		
		System.out.println("\nPayment#\tInterest\tPrincipal\tBalance");
		
		for(int pay = 1 ; pay<numberOfYears * 12  ; pay++ ) {
			
		
			double interest = monthlyInterestRate * balance;
			double principal = monthlyPayment - interest;
			balance = balance - principal;
			
			System.out.printf("%d\t\t%.2f\t\t%6.2f\t\t%.2f \n" , pay, interest , principal , balance);
			
			
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
