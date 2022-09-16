package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_34 {

	public static void main(String[] args) {

		int pcWinCount=0;
		int userWinCount=0;
		
		
		Scanner input = new Scanner(System.in);
		
		do{
			int pc = (int)(Math.random() * 3);
		
		
		System.out.println("scissor(0) , rock(1) , paper(2)");
		int user = input.nextInt();
		
		if (pc == 0) {
			System.out.println("The computer is scissor.");
		}else if (pc == 1) {
			System.out.println("The computer is rock.");
		}else {
			System.out.println("The computer is paper");
		}
		
		System.out.print("you are ");
		
		switch(user) {
		case 0 :System.out.println("scissor");break;
		case 1 :System.out.println("rock");break;
		case 2 :System.out.println("paper");break;
		}
		
		
		if(pc == 0 && user == 2 || pc==1 && user == 0 || pc==2 && user==1) {
			System.out.println("pc win");
			pcWinCount++;
		}else if(pc== 0 && user==0 || pc==1 && user == 1 || pc==2 && user==2) {
			System.out.println("draw - again please");
		}else {
			System.out.println("You win");
			userWinCount++;
		}
		if(pcWinCount==2) {
			System.out.println("Pc won two times and the game finished :) ");
			break;
		}else if(userWinCount==2) {
			System.out.println("You won two times and the game finished :)");
			break;
		}
		
		
		}while(pcWinCount <= 2 || userWinCount <= 2);
		
		System.out.println("\n---------Results------------");
		System.out.println("Computer win " + pcWinCount + " times ");
		System.out.println("You win " + userWinCount + " times ");
		
	}

}
