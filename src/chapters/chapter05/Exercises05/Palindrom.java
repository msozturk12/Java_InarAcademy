package chapters.chapter05.Exercises05;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		String s = input.nextLine();
		
		int ilkHarf = 0;
		int sonHarf=s.length() -1 ;
		
		
		boolean isPalindrom = true;
		while(ilkHarf < sonHarf) {
			if(s.charAt(ilkHarf) != s.charAt(sonHarf)) {
				isPalindrom = false;
				break;
			
			}
		ilkHarf++;
		sonHarf--;
		
		}
		
		
		if(isPalindrom) {
			System.out.println(s + " palindromdur");
		}else {
			System.out.println(s + " palindrom degildir.");
		}
	}

}
