package chapters.chapter04;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter grade ");
		String str = input.nextLine();
		char ch = str.charAt(0);
		ch = str.toUpperCase().charAt(0);
		
		if (Character.isLetter(ch)) {
			
			switch(ch) {
			
			case 'A' : System.out.println("The numeric value for grade " + ch + " is " + "4");break;
			case 'B' : System.out.println("The numeric value for grade " + ch + " is " + "3");break;
			case 'C' : System.out.println("The numeric value for grade " + ch + " is " + "2");break;
			case 'D' : System.out.println("The numeric value for grade " + ch + " is " + "1");break;
			case 'F' : System.out.println("The numeric value for grade " + ch + " is " + "0");break;
			default:System.out.println(ch + " is an invalid grade");
			
			
			}
			
		}
				
					
	}

}
