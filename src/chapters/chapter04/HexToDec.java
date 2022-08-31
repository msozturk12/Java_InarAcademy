package chapters.chapter04;

import java.util.Scanner;

public class HexToDec {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Bir hex giriniz.");
		String hex = input.next();

		if (hex.length() != 1) {
			System.err.println("Lütfen tek karakter girin");
			System.exit(0);
		}
		char ch = hex.toLowerCase().charAt(0);
		int sayı = 0;

		if ('a' <= ch && ch <= 'f') {
			sayı = ch - 'a' + 10;
		} else if ('0' <= ch && ch <= '9') {
			sayı = ch - '0';
		} else {
			System.err.println("hatalı giriş");
			System.exit(0);

		}
		System.out.println("hex  " + ch + "  nın değeri : " + sayı);
	}

}
