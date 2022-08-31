package chapters.chapter03;

import java.util.Scanner;

public class Exercise_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int width = (int) (Math.random() * 101) - 50 ; //-50<= width && width<51
		int height = (int)(Math.random() *201) - 100; //-100<= height && height <101
		
		
		System.out.println("Random coordinate in a rectangle : " + (  width + "," + height )) ;
		
	}

}
