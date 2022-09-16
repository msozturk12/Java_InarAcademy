package chapters.chapter05.chapter05;

public class Exercises_05_33 {

	public static void main(String[] args) {

		// Finding all perfect numbers less than 10,000

		int number = 2;
		int sum = 0;

		System.out.println("<---All the perfect number less than 10_000---> ");
		
		while (number < 10_000) {
			
			sum = 0;
			
			for (int divisor = 1; divisor <= number / 2; divisor++) {

				if (number % divisor == 0) {
					sum += divisor;
				}
			}
			if (sum == number) {
				System.out.println( number);
				
			}
			number++;
		}
	}
}