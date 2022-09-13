package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int count=0;
		int correctCount=0;
		long startTime=System.currentTimeMillis();
		
		while(count<10) {
			int number1 = (int)(Math.random()* 15);
			int number2 = (int)(Math.random()* 15);
			
			System.out.println(number1 + "+" + number2 + "=" + " ?" );
			int answer = input.nextInt();
			
			if(number1 + number2 == answer) {
				correctCount++;
			}
			count++;
		}
		long lastTime = System.currentTimeMillis();
		System.out.println("Correct count is " + correctCount);
		System.out.println("Your test time is " + (int)(lastTime - startTime)/1000);
		
	
	}

}
