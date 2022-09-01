package chapters.chapter04;

import java.util.Scanner;

public class Exercise23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter employee's name:");
		String name = input.next();

		System.out.println("Enter number of hours worked in a week:");
		double numberOfHoursWorked = input.nextDouble();

		System.out.println("Enter hourly pay rate:");
		double payRate = input.nextDouble();

		System.out.println("Enter federal tax withholding rate:");
		double federalTax = input.nextDouble();

		System.out.println("Enter state tax withholding rate:");
		double stateTax = input.nextDouble();

		double grossPay = payRate * numberOfHoursWorked;
		double deduction;
		double federalWithholding = grossPay * federalTax;
		double stateWithholding = grossPay * stateTax;
		double totalDeduction = federalWithholding + stateWithholding;

		System.out.println("Employee Name " + name);
		System.out.println("Hours Worked " + numberOfHoursWorked);
		System.out.println("Pay Rate : " + payRate);
		System.out.println("Gross Pay " + grossPay);
		System.out.println("Deductions: ");
		System.out.println("\tFederal Withholding (20.0%): " + federalWithholding);
		System.out.println("\tState Withholding (9.0%): " + stateWithholding);
		System.out.println("\tTotal Deduction: " + totalDeduction);
		System.out.println("Net Pay : $" + (grossPay - totalDeduction));

	}

}
