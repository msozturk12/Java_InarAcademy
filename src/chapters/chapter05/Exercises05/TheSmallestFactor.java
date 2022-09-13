package chapters.chapter05.Exercises05;

import java.util.Scanner;

public class TheSmallestFactor {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int number = input.nextInt();
		
		int bölen=2;
		while(bölen <= number) {
			if(number%bölen == 0)
				break;
			bölen++;
			
		}
       System.out.println(number +" sayısının birden buyuk en küçük böleni " + bölen + " dir.");		
		
	}

}
