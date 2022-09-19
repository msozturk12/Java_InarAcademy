package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Deneme {
	public static void main(String[] args) {
		final int PER_LINE=10;
		int counter=0;

		for(int number=100 ;number<1000; number+=5){
			

			if(number % 5 == 0 && number % 6 == 0){
				counter++;
				if(counter%PER_LINE==0){
					System.out.println(number);
				}else{
					System.out.print(number + " ");
				}
			}
		}
	
	
	}
}