package chapters.chapter10.Exercises10.Exercise10_12;

import chapters.chapter10.Exercises10.Exercise10_04.Mypoint;

public class Triangle2D {
    //
    private Mypoint p1;
    private Mypoint p2;
    private Mypoint p3;


    public Triangle2D() {
        this(new Mypoint(0, 0), new Mypoint(1, 1), new Mypoint(2, 5));
    }


    public Triangle2D(double p1X, double p1Y, double p2X, double p2Y, double p3X, double p3Y) {

        this(new Mypoint(p1X, p1Y), new Mypoint(p2X, p2Y), new Mypoint(p3X, p3Y));


    }

    public Triangle2D(Mypoint p1, Mypoint p2, Mypoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Mypoint getP1() {
        return this.p1;
    }

    public void setP1(Mypoint p1) {
        this.p1 = p1;
    }

    public Mypoint getP2() {
        return p2;
    }

    public void setP2(Mypoint p2) {
        this.p2 = p2;
    }

    public Mypoint getP3() {
        return p3;
    }

    public void setP3(Mypoint p3) {
        this.p3 = p3;
    }

    public double getArea() {
        double side1 = p1.distance(this.p2);
        double side2 = p1.distance(this.p3);
        double side3 = p2.distance(this.p1);

        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    public double getPerimeter() {
        double side1 = p1.distance(this.p2);
        double side2 = p1.distance(this.p3);
        double side3 = p2.distance(this.p1);
        return side1 + side2 + side3;
    }

    public boolean contains(Mypoint p) {
        return (getArea() == new Triangle2D(p1, p, p2).getArea() + new Triangle2D(p2, p, p3).getArea() + new Triangle2D(p1, p, p3).getArea());
    }

    public boolean contains(Triangle2D t2D){
        return (contains(t2D.getP1()) && contains(t2D.getP2()) && contains(t2D.getP3()));
    }

    public boolean overlaps(Triangle2D t2D){
        return (contains(t2D.getP1()) || contains(t2D.getP2()) || contains(t2D.getP3()));
    }


}
