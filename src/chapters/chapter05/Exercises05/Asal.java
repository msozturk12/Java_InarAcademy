package chapters.chapter05.Exercises05;

public class Asal {

	public static void main(String[] args) {

		boolean isPrime = true;
		
		int number = 2;
		int count=0;
		
		for(int i=1 ; i > 50 ; i +=2) {
			if(i % number == 0 ) {
				isPrime=false;
			
				
			}else {
				System.out.println(i);
			
			}
			number++;
		}
	}

}
