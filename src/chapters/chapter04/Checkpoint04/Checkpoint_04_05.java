package chapters.chapter04.Checkpoint04;

public class Checkpoint_04_05 {

	public static void main(String[] args) {

		int number1 = 34 + (int) (Math.random() * 21); // 34<=number1 && number1 > 55
		int number2 = (int) (Math.random() * 1000); // 0<= number2 && number2 >999
		double number3 = 5.5 + (int) (Math.random() * 50.0); // 5.5<= number3 >55.5

		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
	}

}
