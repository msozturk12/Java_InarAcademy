package chapters.chapter02;
import java.util.Scanner;
public class OrtalamaHesapla {
	public static void main(String[] args) {
		Scanner enes = new Scanner(System.in);
		System.out.println("ortalama hesaplama için üç sayı giriniz");
		
		double sayı1=enes.nextDouble();
		double sayı2=enes.nextDouble();
		double sayı3=enes.nextDouble();
		
		final int a = 20;
		double ortalama=(sayı1+sayı2+sayı3)/3;
		System.out.println(" The three numbers average is " + ortalama );
				
				
	
	}

}
