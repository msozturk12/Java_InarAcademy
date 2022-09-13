package chapters.chapter04;

import java.util.Scanner;

public class Exercise15 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter : ");
		String str = input.next();
		char ch = str.toUpperCase().charAt(0);

		if (Character.isLetter(ch)) {

			if ('A' <= ch && ch <= 'C')
				System.out.println("The corresponding number is 2");
			else if ('D' <= ch && ch <= 'F')
				System.out.println("The corresponding number is 3");
			else if ('G' <= ch && ch <= 'I')
				System.out.println("The corresponding number is 4");
			else if ('J' <= ch && ch <= 'L')
				System.out.println("The corresponding number is 5");
			else if ('M' <= ch && ch <= 'O')
				System.out.println("The corresponding number is 6");
			else if ('P' <= ch && ch <= 'S')
				System.out.println("The corresponding number is 7");
			else if ('T' <= ch && ch <= 'V')
				System.out.println("The corresponding number is 8");
			else if ('W' <= ch && ch <= 'Z')
				System.out.println("The corresponding number is 9");
		}

		else {
			System.out.println(ch + " is an invalid input");
		}
	}
}
