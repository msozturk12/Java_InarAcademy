package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_09 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String highestPointName = "";
		double highestPoint = 0;
		
		String secondName = "";
		double secondPoint = 0;

		System.out.println("Enter the number of student :");
		int numberOfStudent = input.nextInt();

		int i = 0;

		while (i < numberOfStudent) {

			input.nextLine();
			System.out.println("Enter student name : ");
			String name = input.nextLine();
		
			

			System.out.println("Enter the score :");
			double score = input.nextDouble();
			i++;

			if (score > highestPoint) {
				secondPoint=highestPoint;
				secondName=highestPointName;
				highestPoint = score;
				highestPointName = name;
			
			} else if(score > secondPoint) {
				secondPoint = score;
				secondName = name;

			}
		}
		System.out.println("Student with the highest score : " + highestPointName + " with the score " + highestPoint);
		System.out.println("Student with the second-highest score : " + secondName + " with the score " + secondPoint);

	}

}
