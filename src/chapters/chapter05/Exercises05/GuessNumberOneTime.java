package chapters.chapter05.Exercises05;

import java.util.Scanner;

public class GuessNumberOneTime {

	public static void main(String[] args) {
		/**
		 * random sayı alıcam 0 ile 100 dahil
		 * kullanıcı dahil edecek
		 * hıgh/low diyerek yölendirecez
		 */

		/**
		 * 1- Neyi tekrar ediyoruz?
		 *      kullanıcıya soru sormayı
		 *      cevaba göre ipucu
		 *  2-kullanıcı bilene kadar
		 *
		 */
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