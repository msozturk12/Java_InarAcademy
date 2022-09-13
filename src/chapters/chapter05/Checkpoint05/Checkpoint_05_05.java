package chapters.chapter05.Checkpoint05;

public class Checkpoint_05_05 {

	public static void main(String[] args) {

		int x = 80000000;
		while (x > 0)
			x++;
		System.out.println("x is " + x);
												// x is -2147483648 ,it causes overflow.
	}											//2147483647 + 1 is actually -2147483648 so its too large for integer

}
