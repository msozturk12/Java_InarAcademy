package chapters.chapter09.checkPoints09;

import java.util.Date;

public class Checkpoints09_26c {
    public static void main(String[] args) {
        Date date = new Date(1234567);
        m1(date);
        System.out.println(date.getTime());
    }

    public static void m1(Date date) {
        date.setTime(7654321);
    }
}
// this time changed