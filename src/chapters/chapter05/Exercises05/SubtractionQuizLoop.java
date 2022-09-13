package chapters.chapter05.Exercises05;

import java.util.Scanner;

public class SubtractionQuizLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		long startTime = System.currentTimeMillis();
		String output = "";
		int count = 0;
		int dogruSayacı = 0;
		int yanlisSayacı = 0;
		while (count < 3) {
			int number1 = (int) (Math.random() * 10);
			int number2 = (int) (Math.random() * 10);

			if (number1 < number2) {
				int temp = number2;
				number2 = number1;
				number1 = temp;

			}
			System.out.println(number1 + " - " + number2 + " =?");
			int answer = input.nextInt();

			output += number1 + " - " + number2 + " = " + answer;
			if (number1 - number2 == answer) {
				System.out.println("well done");
				dogruSayacı++;
				output += " dogru\n";

			} else {
				System.out.println("faillll");
				yanlisSayacı++;
				output += " yanlış\n";
			}
			count++;
		}
		long finishTime = System.currentTimeMillis();
		int totalTime = (int) ((finishTime - startTime) / 1000);
		System.out.println("Toplam süre " + totalTime + " saniyedir.");
		System.out.println(count + " tane soru soruldu ");
		System.out.println(dogruSayacı + " tane dogru cevap verdiniz ");
		System.out.println(yanlisSayacı + " tane yanlış cevap verdiniz ");
		System.out.println(output);
	}

}
