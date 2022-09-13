package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_12 {

	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");
		int number = input.nextInt();
		int n = 1;
		
		while(Math.pow(n, 2) < number) {            //n^2>number the smallest n
			n++;
			
		}
	System.out.println("The smallest integer n is " + n);
	
	}

}
