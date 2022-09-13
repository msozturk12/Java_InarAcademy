package chapters.chapter04;

public class Exercise06 {
	public static void main(String[] args) {

		double angle1 = Math.random() * (2 * Math.PI);
		double angle2 = Math.random() * (2 * Math.PI);
		double angle3 = Math.random() * (2 * Math.PI);

		double radius = 40;

		double x1 = radius * Math.cos(angle1);
		double y1 = radius * Math.sin(angle1);

		double x2 = radius * Math.cos(angle2);
		double y2 = radius * Math.sin(angle2);

		double x3 = radius * Math.cos(angle3);
		double y3 = radius * Math.sin(angle3);

		System.out.println("x1 and y1 is " + "( " + x1 + " , " + y1 + ")");
		System.out.println("x2 and y2 is " + "( " + x2 + " ,  " + y2 + ")");
		System.out.println("x3 and y3 is " + "( " + x3 + " ,  " + y3 + ")");

	}
}
