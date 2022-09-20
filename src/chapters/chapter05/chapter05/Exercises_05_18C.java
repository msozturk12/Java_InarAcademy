package chapters.chapter05.chapter05;

public class Exercises_05_18C {

    public static void main(String[] args) {

        System.out.println("Pattern C");
        for (int i = 1; i <= 6; i++) {
            for (int s = 6 - i; s > 0; s--) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
