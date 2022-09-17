package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_51 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str1 = input.nextLine();

		System.out.println("Enter the second string: ");
		String str2 = input.nextLine();

		String result = "";
		
		int i = 0;
		
		do {
			
			result += str1.charAt(i);
			i++;
		
		}while(str1.charAt(i) == str2.charAt(i));
		
		
		if(result.length() > 0) {
			System.out.println("The common prefix is " + result);
		}else {
			System.out.println(str1 + " and " + str2 + "have no common prefix ");
		}
	
	}

}
