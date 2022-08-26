
package chapters.chapter02;

import java.util.Scanner;

public class Exercise_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of minutes: ");
		int minutes = input.nextInt();
		
		
		int years;
		int days;
		 
		years = minutes / 365/24/60 ;
		days= ((minutes % (60 * 24 * 365)) / (24 * 60)) ;
		
		System.out.println( minutes + " minutes is approximately " + years + " years and " + days + " days" );
		
		
				
		
		
		
	}

}
