package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Deneme {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		
		String str = input.nextLine();
		
		int counterForVowel = 0;
		int counterForConsonant = 0;
		
		for(int i = 0; i < str.length(); i++){
			
			if(str.charAt(i) == ' '){
				
				i++;
			}
			
			if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' ||
					str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) == 'a' ||
					str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
				
				counterForVowel++;
			}
			else{
				
				counterForConsonant++;
			}
		}
		System.out.println("The number of vowels is " + counterForVowel);
		System.out.println("The number of consonants is " + counterForConsonant);
		}

	}


