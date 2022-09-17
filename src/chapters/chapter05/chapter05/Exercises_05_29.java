package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_29 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the year ");
		int year = input.nextInt();

		System.out.println("Enter first day of the year");
		int firstDayOfTheYear = input.nextInt();
		
		int numberOfDaysInMonth=0;
		
		for(int i = 0 ; i<12 ; i++) {
			String month="";
			switch(i) {
			
				case 0 : month="January" ;numberOfDaysInMonth =31;break;
				case 1 : month="February" ; numberOfDaysInMonth = ((year %4 ==0 || year%100 !=0) && (year%400==0)) ? 29 : 28;break;
				case 2 : month="March" ;numberOfDaysInMonth =31;break;
				case 3 : month="April" ;numberOfDaysInMonth =30;break;
				case 4 : month="May" ;numberOfDaysInMonth =31;break;
				case 5 : month="June" ;numberOfDaysInMonth =30;break;
				case 6 : month="July" ;numberOfDaysInMonth =31;break;
				case 7 : month="August" ;numberOfDaysInMonth =31;break;
				case 8 : month="September" ;numberOfDaysInMonth =30;break;
				case 9 : month="Octaber" ;numberOfDaysInMonth =31;break;
				case 10 : month="November" ;numberOfDaysInMonth =30;break;
				case 11 : month="December" ;numberOfDaysInMonth =31;break;
			
			
			}
		System.out.printf("%19s %-10s",month,year);
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
		
		int firstDayOfTheMonth=0;
		 firstDayOfTheMonth=firstDayOfTheYear % 7;
		
		 	switch(i) {
		 		case 0 : firstDayOfTheYear += 31;break;
		 		case 1 : firstDayOfTheYear += ((year %4 ==0 || year%100 !=0) && (year%400==0)) ? 29 : 28;break;
		 		case 2 : firstDayOfTheYear += 31;break;
		 		case 3 : firstDayOfTheYear += 30;break;
		 		case 4 : firstDayOfTheYear += 31;break;
		 		case 5 : firstDayOfTheYear += 30;break;
		 		case 6 : firstDayOfTheYear += 31;break;
		 		case 7 : firstDayOfTheYear += 31;break;
		 		case 8 : firstDayOfTheYear += 30;break;
		 		case 9 : firstDayOfTheYear += 31;break;
		 		case 10 : firstDayOfTheYear += 30;break;
		 		case 11 : firstDayOfTheYear += 31;break;
		
		    }
		
		
		for(int s = 0 ; s < firstDayOfTheMonth ; s++) {
			System.out.print("      ");
		
		}
		
		int count = firstDayOfTheMonth;
		for(int k= 1 ; k <= numberOfDaysInMonth ; k++) {
			if(count % 7 == 0) {
				System.out.println();
				System.out.printf("%3d",k);
			}else {
				System.out.printf("%3d",k);
				
			}
		System.out.print("   ");
		count++;
		
		
		}
		
		System.out.println();		
		System.out.println();
		
		}
	}

}
