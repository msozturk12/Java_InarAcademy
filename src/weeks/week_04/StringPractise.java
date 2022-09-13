package weeks.week_04;

public class StringPractise {

	public static void main(String[] args) {

		length();
		breakLine();

		substring();
		breakLine();

		equalsIgnoreCase();
		breakLine();

		contains();
		breakLine();

		trim();

		charAt();
		breakLine();

		toLowerCase();
		breakLine();

		toUpperCase();
		breakLine();

		concat();
		breakLine();

		compareTo();
		breakLine();

		compareToIgnoreCase();
		breakLine();

	}

	public static void breakLine() {
		System.out.println("----------------------------------------------");
	}

	public static void length() {

		String temp = "I love Inar Academy";

		int length = temp.length();
		System.out.println(length);

	}

	public static void substring() {

		String temp = "Inar Academy";

		String yeni = temp.substring(3, 9);
		System.out.println(yeni);
	}

	public static void equalsIgnoreCase() {

		String a = "Inar ACADEMY";
		String b = "InAr ACAdemy";

		System.out.println(a.equalsIgnoreCase(b));

	}

	public static void contains() {
		String temp = "abcde";
		String temp2 = "abc";
		System.out.println(temp.contains(temp2));

	}

	public static void trim() {
		String abc = "  Inar Academy  ";
		System.out.println(abc.trim());

	}

	public static void charAt() {
		String qwe = "InarAcademy";
		System.out.println(qwe.charAt(2));

	}

	public static void toLowerCase() {
		String temp = "I LOVE INAR ACADEMY";

		System.out.println(temp.toLowerCase());

	}

	public static void toUpperCase() {

		String asd = "ınar academy";
		System.out.println(asd.toUpperCase());
	}

	public static void concat() {
		String a = "Ali ";
		String b = "ata ";
		System.out.println(a.concat(b));
	}

	public static void compareTo() {

		String a = "Inar Acad";
		String b = "Inar";
		System.out.println(a.compareTo(b));
	}

	public static void compareToIgnoreCase() {
		String a = "Inar AcaDEMY";
		String b = "Inar";
		System.out.println(a.compareToIgnoreCase(b));
	}

}
