package weeks.week_03;

import java.util.Scanner;

public class Question_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the ages : ");
		int age1 = input.nextInt();
		int age2 = input.nextInt();
		int age3 = input.nextInt();

		int oldest = 0;
		int youngest = 0;

		if (age1 > age2 && age1 > age3) {
			oldest = age1;
			if (age2 > age3)
				youngest = age3;
			else
				youngest = age2;
		}
		if (age2 > age1 && age2 > age3) {
			oldest = age2;
			if (age3 > age1)
				youngest = age1;
			else
				youngest = age3;
		}

		if (age3 > age1 && age3 > age2) {
			oldest = age3;
			if (age1 > age2)
				youngest = age2;
			else
				youngest = age1;
		}

		System.out.println("Youngest age is: " + youngest + " Oldest age is: " + oldest);
	}

}
