package chapters.chapter03.Checkpoint03;

public class Checkpoint_03_08 {
	public static void main(String[] args) {

		int x = 3;
		int y = 2;
		int z;

		if (x > 2) {
			if (y > 2) {
				z = x + y;
				System.out.println("z is " + z);
			}
		} else
			System.out.println("x is " + x);
	}
}
//  At first x goes to if statement and it flow because it is true 
// but then it can't flow through nested if so the program ends.