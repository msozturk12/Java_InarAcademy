package chapters.chapter05.chapter05;

public class Exercises_05_24 {

	public static void main(String[] args) {

		double sum = 0;
		
		for(double m = 1,n=3 ; m<98 && n<100 ; m+=2,n+=2) {
			
			sum+=(m/n);
		}
		System.out.printf("%.2f " , sum);
	}

}
