package weeks.week_04;

import java.util.Scanner;

public class isPalindrom {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string ");
		String s = input.nextLine();
		
		
		boolean isPalindrom = true;

		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				isPalindrom = false;

			}
		}
		if (isPalindrom) {
			System.out.println(s + " palindromdur");
		} else {
			System.out.println(s + " palindrom degildir.");
		}

	}
}
