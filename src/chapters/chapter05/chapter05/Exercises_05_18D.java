package chapters.chapter05.chapter05;

public class Exercises_05_18D {

	public static void main(String[] args) {

		System.out.println("Pattern D");

		for (int row = 0; row <=6 ; row++) {
			for (int gap = 0 ; gap < row ; gap++) {
				System.out.print("  ");
			}
			for (int colon = 1 ; colon < 7 - row ; colon++) {
				System.out.print( colon + " ");
			}
			System.out.println();
		}
			
	}
}