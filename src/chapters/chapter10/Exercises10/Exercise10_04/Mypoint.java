package chapters.chapter10.Exercises10.Exercise10_04;

public class Mypoint {
    private double x;
    private double y;

    public Mypoint() {
        this(0, 0);
    }

    public Mypoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distance(Mypoint point) {
        double a = Math.pow(point.getX() - this.x, 2);
        double b = Math.pow(point.getY() - this.y, 2);
        return Math.sqrt(a + b);

    }

    public double distance(double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - this.x, 2) + Math.pow(y2 - this.y, 2));
    }

}
