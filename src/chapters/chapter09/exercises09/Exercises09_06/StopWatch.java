package chapters.chapter09.exercises09.Exercises09_06;

public class StopWatch {

    /*
    Stopwatch
    ----------------
    -startTime:long
    -endtime:long
    +StopWatch()
    +getStartTime():long
    +getEndTime():long
    +start()
    +stop()
    +getElapsedTime():long

     */
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return (getEndTime() - getStartTime());
    }

}
