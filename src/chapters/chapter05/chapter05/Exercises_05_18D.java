package chapters.chapter05.chapter05;

public class Exercises_05_18D {

    public static void main(String[] args) {

        System.out.println("Pattern D");
        for (int i = 1; i <= 6; i++) {
            for (int s = 1; s < i; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();

        }


    }
}