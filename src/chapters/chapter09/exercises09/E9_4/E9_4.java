package chapters.chapter09.exercises09.E9_4;

import java.util.Random;

public class E9_4 {
    public static void main(String[] args) {

        Random random1 = new Random(1000);
        for (int i = 0; i < 50; i++) {
            int r1 = random1.nextInt(100);//ınteger between 0-100
            System.out.printf("%3d ",r1);
            if ((i + 1) % 25 == 0) {
                System.out.println();
            }
        }
        System.out.println("-----------------------------------------------------");
        Random random2 = new Random(1000);
        for (int i = 0; i < 50; i++) {
            int r2 = random2.nextInt(100);//ınteger between 0-100
            System.out.printf("%3d ",r2);
            if ((i + 1) % 25 == 0) {
                System.out.println();
            }
        }

    }
}
