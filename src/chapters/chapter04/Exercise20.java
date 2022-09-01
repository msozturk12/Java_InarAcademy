package chapters.chapter04;

import java.util.Scanner;

public class Exercise20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = input.next();

		int len = str.length();
		char first = str.charAt(0);

		System.out.println("Length is " + len + " and the first character is " + first);

	}

}
