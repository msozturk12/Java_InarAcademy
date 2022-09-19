package chapters.chapter05.chapter05;

public class Exercises_05_03 {

    public static void main(String[] args) {

        /**
         * conversion kg--> pounds
         * 1 kg = 2.2p
         */
        System.out.println("Kilograms		Pounds");

        for (int k = 1; k < 200; k += 2) {
            System.out.printf("%-3d				%4.1f \n", k, k * 2.2);
        }

    }

}
