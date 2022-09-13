package chapters.chapter05.Checkpoint05;

public class Checkpoint_05_03 {

	public static void main(String[] args) {

		int i = 1;
		while (i < 10)
			if (i % 2 == 0)
				System.out.println(i);  // infinit

		System.out.println("----------------------------------------------------------------");
		int i2 = 1;
		while (i2 < 10)
			if (i2 % 2 == 0)
				System.out.println(i2++); // infinit

		System.out.println("----------------------------------------------------------------");
		int iİ = 0;
		while (iİ < 10)
			if ((iİ++) % 2 == 0)
				System.out.println(iİ); // 3,5,7,9

	}

}
