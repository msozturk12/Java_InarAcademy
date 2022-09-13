package chapters.chapter05.Exercises05;

import java.util.Scanner;

public class SentinelValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Toplanacak sayıyı giriniz (cıkıs için 0 giriniz)");
		int number = input.nextInt();
		
		int sum = 0 ;
		while(number != 0) {				//sentinel value is 0
			sum += number;
			System.out.println("Toplanacak sayıyı giriniz (cıkıs için 0 giriniz)");
			 number = input.nextInt();
			
		}
		System.out.println("toplam: " + sum);
	}

}
