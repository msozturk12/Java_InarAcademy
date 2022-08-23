package chapters.chapter01;

public class Exercise12 {
	public static void main(String[] args) {
		double mile;
		double km;
		double time;
		double velocity;

		mile = 24;
		km = mile * 1.6;
		time = 60 * 60 + 6 * 40 + 30;
		velocity = km * 100 / time;
		// Saatte km/sa hızı
		System.out.println(velocity * 3.6);

	}
}
