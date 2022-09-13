package chapters.chapter05.Checkpoint05;

import java.util.Scanner;

public class Checkpoint_05_04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number;
		int max;
		
		number = input.nextInt();
		max = number;
		
		while (number != 0) {
			number = input.nextInt();
			if (number > max)
				max = number;
		}
		System.out.println("max is " + max);
		System.out.println("number is " + number);
	}

}
// max is 5   number 0
