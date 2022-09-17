package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_50 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = input.nextLine();

		int count = 0;

		for (int i = 0; i < str.length(); i++) {							//Character.isUpperCase(str.charAt(i)	

			if ('A' <= str.charAt(i) && str.charAt(i)<='Z'){
				
				count++;

			}
			
		}
		System.out.println("The number of uppercase letters is : " + count);
	}
}


