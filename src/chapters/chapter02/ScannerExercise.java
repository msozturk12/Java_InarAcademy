package chapters.chapter02;

import java.util.Scanner;

public class ScannerExercise {
	public static void main(String[] args) {

		System.out.println("Bir sayı giriniz");

		Scanner number = new Scanner(System.in);

		int sayı = number.nextInt();

		System.out.println("Girdiğiniz sayı " + sayı);

	}
}