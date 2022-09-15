package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_19 {

	public static void main(String[] args) {

//		Can't do it yet
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number of lines( 1 to 15) for pyramid : ");
		int lines = input.nextInt();

		for (int i = 1; i < lines+1; i++) {
			
			for (int s = 0; s<lines-i; s++) {
				System.out.print("   ");
			}
			for (int k = i-1; k >= 0 ; k--) {

				System.out.printf("%3d",(int)Math.pow(2,k));
			}
			for (int z = 2; z <  i+1; z++) {
				System.out.printf("%3d",(int)Math.pow(2,z));
			}
			System.out.println();
		}
	}

}
