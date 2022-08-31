package chapters.chapter03;

import java.util.Scanner;

public class Exercise_05 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter today's day:");
		int todaysDay = input.nextInt();

		System.out.println("Enter the number of days elapsed since today:");
		int elapsedDay = input.nextInt();

		System.out.print("Today is ");

		switch (todaysDay) {
		case 0:
			System.out.print("Sunday");
			break;
		case 1:
			System.out.print("Tuesday");
			break;
		case 2:
			System.out.print("Wednesday");
			break;
		case 3:
			System.out.print("Thursday");
			break;
		case 4:
			System.out.print("Friday");
			break;
		case 5:
			System.out.print("Saturday");
			break;
		case 6:
			System.out.print("Sunday");
			break;
		}

		System.out.print(" and the future day is ");

		switch ((elapsedDay + todaysDay) % 7) {
		case 0:
			System.out.print("Sunday");
			break;
		case 1:
			System.out.print("Tuesday");
			break;
		case 2:
			System.out.print("Wednesday");
			break;
		case 3:
			System.out.print("Thursday");
			break;
		case 4:
			System.out.print("Friday");
			break;
		case 5:
			System.out.print("Saturday");
			break;
		case 6:
			System.out.print("Sunday");
			break;

		}

	}

}
