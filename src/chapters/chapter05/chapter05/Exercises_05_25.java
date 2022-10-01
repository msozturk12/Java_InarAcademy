package chapters.chapter05.chapter05;

public class Exercises_05_25 {

	public static void main(String[] args) {

		double sum1 = 0;
		for (double i = 1; i <= 10_000; i++) {

			sum1+=(Math.pow(-1,i+1)/((2*i)-1));

		}
		System.out.println(" For i = 10_000 , the result is " + 4 * sum1);

		double sum2 = 0;
		for (double i = 1; i <= 20_000; i++) {

			sum2 += (Math.pow(-1, i + 1) / ((2 * i) - 1));

		}
		System.out.println(" For i = 20_000 , the result is " + 4 * sum2);

		double sum3 = 0;
		for (double i = 1; i <= 100_000; i++) {

			sum3 += (Math.pow(-1, i + 1) / ((2 * i) - 1));

		}

		System.out.println(" For i = 100_000 , the result is " + 4 * sum3);

	}

}
