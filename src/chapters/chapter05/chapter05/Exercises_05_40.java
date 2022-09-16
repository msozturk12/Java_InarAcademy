package chapters.chapter05.chapter05;

public class Exercises_05_40 {

	public static void main(String[] args) {

		int count = 0;
		int tailCount = 0;
		int headCount = 0;
		int number = 0;
		System.out.println("(0) for head and (1) for tails");

		for (count = 0; count < 1_000_000; count++) {

			number = (int) (Math.random() * 2);
			if (number == 0) {
				tailCount++;
			} else {
				headCount++;
			}

		}

	System.out.println("Heads --> " + headCount + " time and " + "Tail --> " + tailCount);
	}

}
