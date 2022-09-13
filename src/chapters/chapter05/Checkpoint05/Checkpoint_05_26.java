package chapters.chapter05.Checkpoint05;

public class Checkpoint_05_26 {

	public static void main(String[] args) {
		
		testContinue();
		
	}
		public static void testBreak() {
		int sum = 0;
		int number = 0;
		
		while( number < 20  && sum < 100) {
			number++;
			sum+=number;
			
		}

		System.out.println("The number is " + number);
		System.out.println("The sum is " + sum);
	}

		
		public static void testContinue() {
			int sum = 0;
			int number = 0;
			while (number < 20) {
				number++;
				if(number != 10 && number != 11) {
					sum+=number;
				}
			}
			System.out.println("The sum is " + sum);
		}
}
