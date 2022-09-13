package chapters.chapter05.chapter05;

public class Exercises_05_05 {

	public static void main(String[] args) {

		System.out.println("Kilograms\tPounds\t |	Pounds \t\tKilograms");
		
		for(int k =1,p=20 ; k<200 && p<520 ; k+=2,p+=5) {
			
			System.out.printf("%d\t\t %5.1f \t |	%d\t\t %6.2f \n",k , k*2.2 , p , p/2.2);
		}
	}

}
