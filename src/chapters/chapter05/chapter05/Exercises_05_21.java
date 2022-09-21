package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_21 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		System.out.println("Enter Loan Amount");
		double loanAmount=input.nextDouble();
		System.out.println("Enter Number of Years");
		double numberOfYears=input.nextDouble();

		double monthlyInterestRate=0;


		System.out.println("Interest Rate	Monthly Payment		Total Payment");

		for(double i =5 ; i<8 ;i+=0.125){
			 monthlyInterestRate = i / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate / (1
					- 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			double totalPayment = monthlyPayment * numberOfYears * 12;

			System.out.printf("%.3f$ %15.2f %21.2f\n",i,monthlyPayment,totalPayment);

		}

	}

}
