package chapters.chapter05.Exercises05;

public class Asal {

	public static void main(String[] args) {

		int divisor = 2;
		int number = 2;
		
		while (number <= 100) {

			boolean isPrime = true;

			for (divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) {
					isPrime = false;
					
				}
			}
			if (isPrime) {
				System.out.println(number);

			}
			number++;
		}
	}
}