package chapters.chapter09.checkPoints09;

import java.util.Date;

public class Checkpoints09_26d {
    public static void main(String[] args) {
        Date date = new Date(1234567);
        m1(date);
        System.out.println(date.getTime());
    }

    public static void m1(Date date) {
        date = null;
    }

} //output-- 1234567
