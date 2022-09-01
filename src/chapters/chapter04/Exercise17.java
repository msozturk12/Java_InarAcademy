package chapters.chapter04;

import java.nio.file.FileSystemLoopException;
import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a year ");
		int year = input.nextInt();

		System.out.print("Enter the first three letter  of a month name");
		String month = input.next();
		
		boolean leapYear = ((year % 4 == 0 &&  year % 10 !=0) || (year % 400 ==0));
		
	  switch(month) {
	  	case "Jan" : 
	  	case "Mar" : 
	  	case "May" : 
	  	case "Jul" : 
	  	case "Aug" : 
	  	case "Oct" : 
	  	case "Dec" : System.out.println( month + " " +  year + " has 31 days"  ); break;
	  	case "Apr" : 
	  	case "Jun" : 
	  	case "Sep" :System.out.println(month + " " + year + " has 30 days " );break;
	  	case "Feb" :System.out.println(month + " " +  year + " " + " has" + ((leapYear) ? " 29 days " : " 28 days "));break;
	 
	  }
		
	}
}