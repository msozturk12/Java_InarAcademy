package chapters.chapter05.Checkpoint05;

public class Checkpoint_05_25 {

	public static void main(String[] args) {

		int i = 0, sum = 0;
		while (i < 4) {
			if (i % 3 == 0) {
				i++;
				continue;
			}
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
/* int i = 0, sum = 0; 
  while (i < 4) {
  if (i % 3 == 0) continue;
  sum += i;
  i++;*/