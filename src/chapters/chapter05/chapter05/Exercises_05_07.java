package chapters.chapter05.chapter05;

public class Exercises_05_07 {

	public static void main(String[] args) {
		/**
		 * this year tuition = 10_000
		 * increase 0.05 every year
		 * in one year the tuition will be 10_000+(10_000*0.05)--->10_500
		 * compute the tuition in ten years
		 * and total cost of four year after ten year
		 * while(year<15)
		 * 			if(year<=10)...
		 */

		double tuititon = 10000;
		double tenYearTuition=0;
		double lastFourYear=0;
		int year=1;

		while(year<15){
			tuititon = tuititon + (tuititon*0.05);
			System.out.printf("%d. years tuition is $%.2f\n" ,year,tuititon);
			if(year<=10){
				tenYearTuition+=tuititon;

			}else{
				lastFourYear +=tuititon;
			}

		year++;
		}
		System.out.printf("Tuition in ten years %.2f " , tenYearTuition);
		System.out.printf("\nThe total cost of four years’ worth of tuition after the tenth year %.2f " , lastFourYear );


	}

}
