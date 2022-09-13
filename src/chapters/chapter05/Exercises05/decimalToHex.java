package chapters.chapter05.Exercises05;

import java.util.Scanner;

public class decimalToHex {

	public static void main(String[] args) {

		

		Scanner input= new Scanner(System.in);
		
		System.out.println(" bir tam sayıyı giriniz. ");
		int tamSayı=input.nextInt();
		
		String hexSayı="";
		
		int kalan= tamSayı;
		while(kalan > 0) {
			
			int basamak = kalan % 16;
			if(basamak < 10) {
				hexSayı= basamak + hexSayı;
			}else {
				hexSayı = (char)('A' + (basamak - 10)) + hexSayı ;
			}
			kalan /= 16;
			
		}
		
		
		
		System.out.println(tamSayı + " tam sayısını hex e çevrilmiş hali: " + hexSayı + " dır.");
	}

}
