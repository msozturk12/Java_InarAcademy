package chapters.chapter05.chapter05;

public class Exercises_05_18C {

	public static void main(String[] args) {

		System.out.println("Pattern C");
		
		for(int row = 1 ; row <= 6 ; row++) {
			
			for(int gap = 6 - row; gap >= 1 ; gap--) {
				System.out.print("  ");
			}
			for(int colon = row ; colon >= 1  ; colon--  ) {
				System.out.print(colon + " ");
				
				

			}
			System.out.println();
		}
		
	}

}
