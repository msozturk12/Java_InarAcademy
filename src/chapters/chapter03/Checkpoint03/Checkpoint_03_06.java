package chapters.chapter03.Checkpoint03;

import java.util.Scanner;

public class Checkpoint_03_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your score: ");
		int score = input.nextInt();
		int pay = 1000;

		if (score > 90)
			pay += pay * 0.03;
		else
			pay += pay * 0.01;
		System.out.println("Your score is " + score + " and your pay is " + pay);
	}

}
