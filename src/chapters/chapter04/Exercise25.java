package chapters.chapter04;



public class Exercise25 {

	public static void main(String[] args) {


		int letter1 = 66 + (int) (Math.random() * 25);
		System.out.print((char) letter1);
		
		int letter2= 66 + (int) (Math.random() * 25);
		System.out.print((char) letter2);
		
		int letter3= 66 + (int) (Math.random() * 25);
		System.out.print((char) letter3);

		int number = 1001 + (int) (Math.random() * 8999);
		System.out.println(number);
		
		System.out.println("Your vehicle plate number is " + (char)letter1 +  (char)letter2 +  (char)letter3 + number);
		
	}

}
