package chapters.chapter10.Exercises10.Exercise10_01;

import chapters.chapter10.Exercises10.Exercise10_01.Time;

public class TimeTest {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);

        System.out.printf("Current time is %d:%d:%d \n", time1.getHour() + 3, time1.getMinute(), time1.getSecond());

        System.out.printf("For elapsed time,the time is--> %d:%d:%d ", time2.getHour(), time2.getMinute(), time2.getSecond());

        System.out.println();
        displayTime(time1);
        displayTime(time2);

    }

    public static void displayTime (Time t){
        System.out.println((t.getHour()<10 ? "0"+t.getHour()+3 : t.getHour()+3) + ":" +
                (t.getMinute()<10 ? "0"+t.getMinute() : t.getMinute()) + ":" +
                (t.getSecond()<10 ? "0"+t.getSecond() : t.getSecond()));
    }
}
