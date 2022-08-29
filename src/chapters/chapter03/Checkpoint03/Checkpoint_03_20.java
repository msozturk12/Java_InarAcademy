package chapters.chapter03.Checkpoint03;

public class Checkpoint_03_20 {
	public static void main(String[] args) {

		double x = (int) (Math.random() * 10);
		double y = (int) (Math.random() * 10);
		
		if (Math.abs(x - 5) < 4.5)
			System.out.println(Math.abs(x - 5) < 4.5);

		if (Math.abs(y - 5) > 4.5)
			System.out.println(Math.abs(x - 5) > 4.5);

	}
}
