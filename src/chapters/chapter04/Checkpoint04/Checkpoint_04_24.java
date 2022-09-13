package chapters.chapter04.Checkpoint04;

public class Checkpoint_04_24 {

	public static void main(String[] args) {

		System.out.printf("amount is %f %e\n", 32.32, 32.32); // amount is 32,320000 3,232000e+01
		System.out.printf("amount is %5.2f%5.4e\n", 32.327, 32.32);// amount is 32,333,2320e+01
		System.out.printf("%6s\n", "Java"); // Java
		System.out.printf("%6b\n", (1 > 2));//false
		System.out.printf("%-6b%s\n", (1 > 2), "Java"); // false Java
		System.out.printf("%6b%-8s\n", (1 > 2), "Java"); // falseJava

	}

}
