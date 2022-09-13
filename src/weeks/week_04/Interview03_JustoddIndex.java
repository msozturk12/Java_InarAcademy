package weeks.week_04;

import java.util.Iterator;

public class Interview03_JustoddIndex {

	public static void main(String[] args) {

		
		String s = "TarıkInarAcademy";
		int length = s.length();
		
		System.out.println("TarıkInaracademy");
		
		
		for(int i = 1; i <length ; i = i+2) {
			System.out.print(s.charAt(i));
			
		}
		
	}

}
