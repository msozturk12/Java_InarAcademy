package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_49 {

	public static void main(String[] args) {

		int vowelCount = 0;
		int constantCount = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");

		String str = input.nextLine();
		str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == ' ') {

				i++;
			}

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vowelCount++;

			} else {
				constantCount++;
			}

		}
		System.out.println("The number of vowels is " + vowelCount);
		System.out.println("The number of consonants is " + constantCount);
	}
}