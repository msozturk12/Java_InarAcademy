package chapters.chapter05.chapter05;

public class Exercises_05_27 {

	public static void main(String[] args) {

		
		final int PER_LINE = 10;
		int count = 0;

		
		for (int year = 101; year < 2100; year++) {
			
			if  ((year % 4 == 0 && year % 10 != 0) || (year % 400 == 0)) {

				count++;

				if (count % PER_LINE == 0) {
					System.out.println(year);
				} else {
					System.out.print(year + " ");
				}
			}
		}

		System.out.println("\nThe leap year count is " + count);
	}

}
