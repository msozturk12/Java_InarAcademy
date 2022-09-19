package chapters.chapter05.Exercises05;

import java.util.Iterator;

public class CarpimTablosu {

	public static void main(String[] args) {

		System.out.println("-----Multiplication  Table-----");
		System.out.print("     ");
		for(int i = 1 ; i<10 ; i++) {
			System.out.print(i + "   ");
		}
		System.out.println("\n--------------------------------------------");
		for(int i = 1 ; i < 10 ; i++){
			System.out.print(i + "|");
			for(int j = 1 ; j<10 ;j++){
				System.out.printf("%4d",i*j);

			}
			System.out.println();

		}

	}
}
