package chapters.chapter05.chapter05;

public class Exercises_05_06 {

    public static void main(String[] args) {

        System.out.println("Miles	Kilometers	| Kilometers	Miles");

        for (int m = 1, k = 20; m < 11 && k < 70; m++, k += 5) {

            System.out.printf("%d	%9.3f		| %d		%10.3f\n", m, m * 1.609, k, k / 1.609);

        }

    }

}
