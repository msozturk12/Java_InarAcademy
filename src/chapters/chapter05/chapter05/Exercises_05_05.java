package chapters.chapter05.chapter05;

public class Exercises_05_05 {

    public static void main(String[] args) {

        System.out.println("Kilograms		Pounds		|	Pounds		Kilograms");

        for (int k = 1, p = 20; k < 200 && p < 520; k += 2, p += 5) {
            System.out.printf("%-3d  %17.1f		|	%-3d			%9.2f\n", k, k * 2.2, p, p / 2.2);
        }
    }

}
