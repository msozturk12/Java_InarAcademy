package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_30 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an amount: ");
		double amount = input.nextDouble();
		
		System.out.println("Enter an interest rate: ");
		double annualInterestRate=input.nextDouble();
		
		System.out.println("Enter the number of month: ");
		int month =input.nextInt();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		
		
		double savingAccount = 0;
		for(int m = 1; m<=month ; m++) {
			
			savingAccount = (amount + savingAccount) * (1 + monthlyInterestRate);
			
		}
	
	System.out.printf("The amount in the savings account after " + month + " month---> %.2f " , savingAccount);
	
	}

}
