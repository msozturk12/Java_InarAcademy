package chapters.chapter05.chapter05;

public class Exercises_05_43 {

	public static void main(String[] args) {

		int count = 0;
		
		for(int n1 = 1 ; n1 <= 7 ; n1++ ) {
			for(int n2 = n1+1 ; n2<=7 ; n2++) {
				
				count++;
				System.out.println( " " +n1 + n2);
				
			}
		}
		System.out.println("\nThe total number of all combinations is " + count);
	}

}
