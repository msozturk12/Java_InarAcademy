package chapters.chapter03.Checkpoint03;

import java.util.Scanner;

public class Checkpoint_03_05 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int pay=200;
	
		System.out.println("Enter your score");
		int score = input.nextInt();

		if (score > 90) {
			pay += pay * 0.03;
			
			System.out.println("Your score is " + score + " and your pay is " + pay);
		}
	}
}
