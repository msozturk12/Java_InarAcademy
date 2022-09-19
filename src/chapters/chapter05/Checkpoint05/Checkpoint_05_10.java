package chapters.chapter05.Checkpoint05;

import java.util.Scanner;

public class Checkpoint_05_10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number; 
		int sum = 0; 
		int count;
		System.out.println("Enter 5 number");
		
		for (count = 0; count < 5; count++) {
			number = input.nextInt();
			sum += number;
		}
		System.out.println("sum is " + sum);
		System.out.println("count is " + count);

	}

}

//sum is 14
//count is 5