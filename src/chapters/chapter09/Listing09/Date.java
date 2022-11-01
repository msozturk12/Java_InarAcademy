package chapters.chapter09.Listing09;

import java.util.Random;

public class Date {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();

        System.out.println(date.toString());

        System.out.println(date.getTime());

        date.setTime(Integer.MAX_VALUE);
        System.out.println(date.toString());

        System.out.println("-----Random Class-------");
        Random r1 = new Random(10);//value of seed
        for (int i = 0; i < 10; i++) {

            System.out.print(r1.nextInt(100) + " ");

        }
        System.out.println();
        Random r2 = new Random(10);
        for (int i = 0; i < 10; i++) {

            System.out.print(r2.nextInt(100) + " ");

        }
        System.out.println();
        Random r3 = new Random();
        System.out.println(r3.nextInt(10));//get random int between 1-10

        for (int i = 0; i <5 ; i++) {
            System.out.print(r3.nextBoolean() +" ");

        }

    }
}
