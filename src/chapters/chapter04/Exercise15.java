package chapters.chapter04;

import java.util.Scanner;

public class Exercise15 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter : ");
		String str = input.next();
		char ch = str.toLowerCase().charAt(0);
		
		if ( Character.isLetter(ch)){
			
			switch(ch) {
			case 'a' : System.out.println(2);break;
			case 'd' : System.out.println(3);break;
			case 'g' : System.out.println(4);break;
			case 'j' : System.out.println(5);break;
			case 'm' : System.out.println(6);break;
			case 'p' : System.out.println(7);break;
			case 't' : System.out.println(8);break;
			case 'w' : System.out.println(9);break;
			
			}
		}
		else {
				System.out.println(ch + " is an invalid input" );
			}	
		}
	}

		

