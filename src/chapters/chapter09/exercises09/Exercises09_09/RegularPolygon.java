package chapters.chapter09.exercises09.Exercises09_09;

public class RegularPolygon {
    /*
    -n:int
    -side:double
    -x:double
    -y:double
    +RegularPolygon()
    +RegularPolygon(n:int,side:double)
    +RegularPolygon(n:int,side:double,x:double,y:double)
    +getN():int
    +setN(n:double)
    +getSide():double
    +setSide(side:double)
    +getX():double
    +setX(x:double)
    +getY():double
    +setY(y:double)
    +getPerimeter():double
    +getArea():double
    +display()
     */
    private int n;
    private double side;
    private double x;
    private double y;

    RegularPolygon() {
        this(3, 1, 0, 0);//default values
    }

    RegularPolygon(int n, double side) {
        this(n, side, 0, 0);

    }

    RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return this.n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return this.n * this.side;
    }

    public double getArea() {
        double area = (n * Math.pow(side, 2)) / 4 * Math.tan(Math.PI / n);
        return area;
    }

    public void display() {
        System.out.println("The perimeter is " + getPerimeter());
        System.out.printf("The area is %.2f",getArea());
    }

}
