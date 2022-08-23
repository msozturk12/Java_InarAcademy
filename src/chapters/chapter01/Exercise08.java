package chapters.chapter01;

public class Exercise08 {
	public static void main(String[] args) {
		double pi = 3.14;
		double radius;
		double area;
		double perimeter;

		radius = 5.5;
		perimeter = 2 * radius * pi;
		area = radius * radius * pi;

		System.out.println("Yarıçapı: " + radius + " olan dairenin çevresi " + perimeter);
		System.out.println("Yarıçapı: " + radius + " olan dairenin alanı " + area);

	}
}
