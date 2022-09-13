package chapters.chapter03;

import java.util.Scanner;

public class Exercise_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int width = -50 +(int) (Math.random() * 101)  ; //-50<= width && width<51
		int height = -100 + (int)(Math.random() *201) ; //-100<= height && height <101
		
		
		System.out.println("Random coordinate in a rectangle : " + (  width + "," + height )) ;
		
	}

}
