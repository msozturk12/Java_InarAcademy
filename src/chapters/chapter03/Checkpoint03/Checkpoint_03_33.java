package chapters.chapter03.Checkpoint03;

import java.util.Scanner;

public class Checkpoint_03_33 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 number");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();

		System.out.println((x < y && y < z) ? "sorted" : "not sorted");
		
// when you enter the input 2 3 6 from the console.The out put is sorted
	}

}
