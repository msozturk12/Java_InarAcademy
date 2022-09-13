package chapters.chapter05.Checkpoint05;

public class Checkpoint_05_13 {

	public static void main(String[] args) {

		int i = 0;
		long sum = 0;
		while (i <= 1000) {
			sum = sum + i;
			i++;
		}

		System.out.println(sum);

		int i2 = 0;
		long sum2 = 0;
		do {
			sum2 = sum2 + i2;
			i2++;
		} while (i2 <= 1000);

		System.out.println(sum2);
	}
}


/* long sum = 0;
for (int i = 0; i <= 1000; i++)
  sum = sum + i;*/