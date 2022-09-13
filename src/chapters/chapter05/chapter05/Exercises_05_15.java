package chapters.chapter05.chapter05;

public class Exercises_05_15 {

	public static void main(String[] args) {

		final int PER_LINE=10;
		int count=0;
		
		for(int i = '!' ; i<='~' ; i++ ) {
			
			count++;
			
			if(count % PER_LINE == 0) {
				System.out.println((char)i);
			}else {
				System.out.print((char)i + " ");
			}
		}
	}

}
