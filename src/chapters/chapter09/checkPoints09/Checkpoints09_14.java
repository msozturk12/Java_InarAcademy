package chapters.chapter09.checkPoints09;

import java.util.Date;

public class Checkpoints09_14 {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println("The elapsed time since Jan 1, 1970 is " + date.getTime() + " milliseconds");
        System.out.println(date.toString());
    }
}