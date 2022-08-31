package chapters.chapter04.Checkpoint04;

public class Checkpoint_04_20 {
	public static void main(String[] args) {

		String s1 = " Welcome ";
		String s2 = " welcome ";

		boolean isEquala = s1.equals(s2);
		System.out.println(isEquala);

		boolean isEqualb = s1.equalsIgnoreCase(s2);
		System.out.println(isEqualb);

		int xa = s1.compareTo(s2);
		System.out.println(xa);

		int xb = s1.compareToIgnoreCase(s2);
		System.out.println(xb);

		boolean b1 = s1.startsWith("AAA");
		System.out.println(b1);

		boolean b2 = s1.endsWith("AAA");
		System.out.println(b2);

		int xg = s1.length();
		System.out.println(xg);

		char xh = s1.charAt(0);
		System.out.println(xh);

		String s3 = s1.concat(s2);
		System.out.println(s3);

		System.out.println(s1.substring(1));

		System.out.println(s1.substring(1, 4));

		String s3l = s1.toLowerCase();
		System.out.println(s3l);

		String s3m = s1.toUpperCase();
		System.out.println(s3m);

		String s3n = s1.trim();
		System.out.println(s3n);
		
		int xo = s1.indexOf('e');
		System.out.println(xo);
		
		int xp = s1.lastIndexOf("abc");
		System.out.println(xp);
		
		
		
		
		

	}

}
