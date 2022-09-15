package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_28 {

	public static void main(String[] args) {
		
		
		
//		NOT FINISHED YET
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the year ");
		int year = input.nextInt();
		
		System.out.println("Enter first day of the year");
		int firstDayOfTheYear=input.nextInt();
		
		String result="";
		
		
		for(int month = 1 ; month <= 12 ; month++) {
			result=" ";
			
			switch(month) {
			case 1 : result+= "January"; break;
			case 2 : result+= "February"; break;
			case 3 : result+= "March"; break;
			case 4 : result+= "April"; break;
			case 5 : result+= "May"; break;
			case 6 : result+= "June"; break;
			case 7 : result+= "July"; break;
			case 8 : result+= "August"; break;
			case 9 : result+= "September"; break;
			case 10 : result+= "Octaber"; break;
			case 11 : result+= "November"; break;
			case 12 : result+= "December"; break;
			
			}
			result += "1, " + year + " is " ;
		
			
			
			firstDayOfTheYear%=7;
			
			switch(firstDayOfTheYear) {
			
			case 0 : 
			}
		}
		
		
		
		
	}

}
