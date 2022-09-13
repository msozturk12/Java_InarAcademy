package weeks.week_04;

public class NoDuplicate {

	public static void main(String[] args) {

		String str = "Hello Innar 7789ıooy";
		String result = " ";
		int len = str.length();

		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);

			if (result.contains("" + ch) == false) {
				result += ch;

			}

		}
		System.out.println(result);
	}

}
