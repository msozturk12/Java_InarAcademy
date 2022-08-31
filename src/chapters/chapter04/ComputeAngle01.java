package chapters.chapter04;

import java.util.Scanner;

public class ComputeAngle01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 points");
		
		char ch = 'A';
		int i = ch;
	
		System.out.println(i);
		System.out.println((int)ch);
		
		System.out.println(ch++);
		
		System.out.println("Merhabalar \"java\" sınıfı ");
		
		
		
		
		
		for (int j = 0; j < 127 ; j++) {
			System.out.printf("%4c" , j);
			if( (j + 1) % 20 ==0 ) {
				System.out.println();
			}
			
			
		}
	}

}
