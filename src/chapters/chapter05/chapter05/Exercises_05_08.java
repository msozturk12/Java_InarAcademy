package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String highestPointName="";
		int highestPoint=0;
		
		System.out.println("Enter the number of student :");
		int numberOfStudent=input.nextInt();
	
		int i = 0;
		
		while(i < numberOfStudent) {
			
			System.out.println("Enter the each student name : ");
			String name = input.next();
			
			System.out.println("Enter the score :");
			int score = input.nextInt();
			i++;
			
			if(score>highestPoint) {
				highestPoint=score;
				highestPointName=name;
			}
		}
	System.out.println("Student who take highest score : " + highestPointName);
	}

}
