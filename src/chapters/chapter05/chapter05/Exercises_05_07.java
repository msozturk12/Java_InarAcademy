package chapters.chapter05.chapter05;

public class Exercises_05_07 {

	public static void main(String[] args) {

		double tuition = 10_000;

		double totalCostOfTenYears=0;
		double fourYearCost=0;
		for (int year = 1; year < 15; year++) {

			tuition = tuition + (tuition * 0.05);
		
			if (year == 10) {
				totalCostOfTenYears=tuition;
			}
			
			if(year>10) {
				fourYearCost+=tuition;
			}
		
		}
		System.out.println("Tuition in ten years is: $" + (int)(totalCostOfTenYears * 100)/100.0);
		System.out.println("After ten year total cost of four years' worth of tuition :  $" +(int)( fourYearCost*100)/100.0);
	}

}
