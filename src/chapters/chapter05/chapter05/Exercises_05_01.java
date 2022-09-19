package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_01 {

	public static void main(String[] args) {
		/**
		 * sayılar girilecek 0 yazana dek
		 * + counter
		 * -counter
		 * sum
		 * average
		 */
		Scanner input = new Scanner(System.in);
		int positiveCount=0;
		int negativeCount=0;
		double sum=0;
		double average=0;
		int counter=0;

		System.out.println("Enter an integer, the input ends if it is 0:");
		int number= input.nextInt();

		if(number==0){
			System.out.println("No numbers are entered except 0");
			System.exit(1);
		}

		while(number!=0){

			if(number>0){
				positiveCount++;
			}else{
				negativeCount++;
			}
			counter++;
			sum+=number;
			average=sum/counter;
			number = input.nextInt();
		}
		System.out.println("The number of positives is " + positiveCount);
		System.out.println("The number of negatives is " + negativeCount );
		System.out.println("The total is " + sum);
		System.out.println("The average is " + average);
	}

}
