package chapters.chapter02;

import java.util.Scanner;

public class Exercise_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a degree in Celsius: ");

		double celsius = input.nextDouble();

		double fahrenheit;

		fahrenheit = (9.0 / 5) * celsius + 32;

		System.out.println( celsius + " Celsius is " + fahrenheit + " Fahrenheit ");

	}

}
