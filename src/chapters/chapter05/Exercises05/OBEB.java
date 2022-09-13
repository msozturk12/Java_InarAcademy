package chapters.chapter05.Exercises05;

import java.util.Scanner;

public class OBEB {

	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		
		System.out.println("1. sayıyı giriniz. ");
		int number1=input.nextInt();
		
		System.out.println("2. sayıyı giriniz. ");
		int number2=input.nextInt();
		
		int obeb = 1;
		int bolen = 2;
		
		while(bolen <= number1 && bolen <= number2) {
			if(number1 % bolen == 0 && number2 % bolen == 0 ) {
				obeb = bolen;
			}
			bolen++;
			
		}
		System.out.println(number1 + " ve " + number2 + " sayılarının obebi :" +  obeb + "  dir.");
		
	}

}
