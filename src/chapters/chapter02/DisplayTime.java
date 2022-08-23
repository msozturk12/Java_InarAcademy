package chapters.chapter02;

import java.util.Scanner;

public class DisplayTime {
	public static void main(String[] args) {
		System.out.println("Enter an ınteger for a second: ");
		Scanner input = new Scanner(System.in);
		int saniye = input.nextInt();
		int dakika = saniye / 60;
		int kalanSaniye = saniye % 60;

		System.out.println(saniye + " second " + dakika + " minute and " + kalanSaniye + " second");

	}
}
