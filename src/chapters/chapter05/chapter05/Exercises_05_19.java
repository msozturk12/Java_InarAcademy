package chapters.chapter05.chapter05;

public class Exercises_05_19 {

	public static void main(String[] args) {

		int lines = 8;

		for (int i = 1; i <= lines ; i++) {

			for (int s = lines - i; s >= 0 ; s--) {
				System.out.print("    ");
			}
			for (int k = 0; k < i; k++) {

				System.out.printf("%4d", (int) Math.pow(2, k));
			}
			for (int z = i - 2; z >= 0; z--) {
				System.out.printf("%4d", (int) Math.pow(2, z));
			}
			System.out.println();
		}
	}

}
