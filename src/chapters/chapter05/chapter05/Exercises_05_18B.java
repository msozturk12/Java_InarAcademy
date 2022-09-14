package chapters.chapter05.chapter05;

public class Exercises_05_18B {

	public static void main(String[] args) {

		System.out.println("Patterb B");

		for (int row = 6; row >= 1; row--) {
		
			for (int clon = 1; clon <= row; clon++) {
				System.out.print(clon + " ");
			}
			System.out.println();
		}
	}

}
