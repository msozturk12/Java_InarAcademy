package chapters.chapter05.chapter05;

public class Exercises_05_39 {

	public static void main(String[] args) {


		double baseSalary = 5000;
		double goal = 30_000;

		double firstComRate = baseSalary * 0.08;
		double secondComRate = baseSalary * 0.10;
		goal = goal - (firstComRate + secondComRate);

		double count = 0;

		do {

			if (count * 0.12 > goal) {
				break;
			}
			count += 0.01;

		} while (count < goal);

		System.out.println("The minimum sales you have to generate in order to make $30,000 --> " + count);

	}

}
