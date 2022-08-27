package chapters.chapter03;

import java.util.Scanner;

public class Exercise_17 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int pc = (int) (Math.random() * 3);

		System.out.println("scissor (0), rock (1), paper (2):");
		int yourSelection = input.nextInt();

		if (pc == 0)
			System.out.println("The compute is scissor.");
		else if (pc == 1)
			System.out.println("The computer is rock.");
		else
			System.out.println("The computer is paper");

		if (yourSelection == 0)
			System.out.println("You are scissor.");
		else if (yourSelection == 1)
			System.out.println("You are rock.");
		else
			System.out.println("You are paper");

		if ((yourSelection == 0 && pc == 2) || (yourSelection == 1 && pc == 0) || (yourSelection == 2 && pc == 1))
			System.out.println(" You won");

		else if (yourSelection == pc)
			System.out.println("draw");

		else
			System.out.println("pc won");

	}
}
