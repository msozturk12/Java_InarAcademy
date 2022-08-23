package chapters.chapter01;

public class Exercise11 {
	public static void main(String[] args) {

		// in 60 second birth value
		double birth = 8.57;

		// in 60 second death value
		double death = 4.61;

		// in 60 second immigrant value
		double ımmıgrant = 1.3;

		int population = 312032486;

		// in one minute population growth is
		double populationGrowth = birth + ımmıgrant - death;

		// in 5 years population is
		double ınFiveYear = (populationGrowth * 5 * 365 * 24 * 60) + population;

		System.out.println(ınFiveYear);
	}

}
