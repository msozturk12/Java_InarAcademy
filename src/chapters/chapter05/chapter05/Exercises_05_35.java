package chapters.chapter05.chapter05;

public class Exercises_05_35 {

	public static void main(String[] args) {

		double sum = 0 ;

		for (double n = 1 ; n <= 624; n++) {

			sum += 1 / ( Math.sqrt(n) + Math.sqrt(n+1)) ;

		}
		System.out.println(sum);
	}

}
