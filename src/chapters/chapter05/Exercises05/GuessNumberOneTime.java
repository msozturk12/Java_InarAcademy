package chapters.chapter05.Exercises05;

import java.util.Scanner;

public class GuessNumberOneTime {

	public static void main(String[] args) {
		int number = (int) (Math.random() * 101);

		Scanner input = new Scanner(System.in);
		int guess;

		do {
			System.out.println("0-100 arası bir sayı giriniz.");
			guess = input.nextInt();

			if (number == guess) {
				System.out.println("bildiniz");

			}else if(number < guess) {
				System.out.println("buyuk sayı girdiniz.");
			} 
			else {
				System.out.println("küçük sayı girdiniz.");
			}
			
						
		} while (number != guess);
	}
}