package chapters.chapter09.exercises09.Exercises09_08;

public class Fan {


    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    String color;

    Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;

    }

    public void setColor(String color) {
        this.color = color;

    }

    public String toString() {
        if (getOn()) {
            return "Fan speed is--> " + getSpeed() + "\nFan color is--> " + getColor() + "\nRadius is--> " + getRadius();
        } else {
            return "Fun is off " + "\nFun color is " + getColor() + " \nRadius is " + getRadius();
        }
    }
}
