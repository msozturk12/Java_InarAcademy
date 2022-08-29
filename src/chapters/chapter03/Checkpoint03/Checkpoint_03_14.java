package chapters.chapter03.Checkpoint03;

public class Checkpoint_03_14 {

	public static void main(String[] args) {
		int number = 30;

		if (number % 2 == 0)
			System.out.println(number + " is even");
		if (number % 5 == 0)
			System.out.println(number + " is multiple of 5");

		if (number % 2 == 0)
			System.out.println(number + " is even");
		else if (number % 5 == 0)
			System.out.println(number + " is multiple of 5");
	
//	when you put 30 in (a) our output is correct
//		but in (b) it cant shows us multiple 5 even if 30 can multiple to 5
	}
	

}
