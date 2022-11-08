package chapters.chapter10.Exercises10.Exercise10_01;

import java.util.concurrent.atomic.AtomicLong;

public class Time {

    private int hour;
    private int minute;
    private int second;


    public Time() {
        this(System.currentTimeMillis());
    }

    public Time(long elapsedTime) {
        this.hour = (int) (elapsedTime / (60 * 60 * 1000) % 24);
        this.minute = (int) (elapsedTime / (60 * 1000) % 60);
        this.second = (int) (elapsedTime / 1000 % 60);

    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return this.hour;
    }

    public long getMinute() {
        return this.minute;
    }

    public long getSecond() {
        return this.second;
    }

    public void setTime(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        this.second = (int) totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        this.minute = (int) totalMinutes % 60;

        long totalHour = totalMinutes / 60;
        this.hour = (int) totalHour % 24;


    }

    public void displayTime() {
        System.out.printf("Current time is %d : %d : %d ", this.hour,this.minute, this.second);
    }
}
