package chapters.chapter04;

public class StringSinifi {

	public static void main(String[] args) {

		String str = "Merhaba Java !";
		System.out.println(str.length());

		String yazı	 = "welcome to java";
		System.out.println(yazı.charAt(0));

		System.out.println(yazı.toUpperCase());

		String str1 = "Merhaba Java !";
		String str2 = "Merhaba Java sınıfı !";

		String str3 = str.substring(7);
		System.out.println(str3);
		
		str2=str.substring(3, 7);
		System.out.println(str2);
		 String str4=str1.replaceAll("haba", "zeyno");
		 System.out.println(str4);
		
		
		boolean b = str1.equals(str2);
		System.out.println(b);

		if (b) {
			System.out.println("two string equals to each other");
		} else {
			System.out.println("no way");
		}

		
		
		
		
		
		
		
	}
}