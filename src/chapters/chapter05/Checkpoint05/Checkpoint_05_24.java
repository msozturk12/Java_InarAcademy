package chapters.chapter05.Checkpoint05;

public class Checkpoint_05_24 {

	public static void main(String[] args) {

		a();
		b();

	}

	public static void a() {
		int balance = 10;
		while (true) {
			if (balance < 9)
				break;
			balance = balance - 9;
		}
		System.out.println("Balance is " + balance);//output:1
																// CONTINUE breaks out of an iteration while the BREAK keyword breaks out of a loop.
	}

	public static void b() {
		int balance = 10;
		while (true) {
			if (balance < 9)
				continue;
			balance = balance - 9;
		}
		//System.out.println("Balance is " + balance);// it will not terminate

	}
}