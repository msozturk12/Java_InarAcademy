package chapters.chapter11.CheckPoint11;

public class CheckPoint11_29b {
    public static void main(String[] args) {
        Object circle1 = new Circle();
        Object circle2 = new Circle();
        System.out.println(circle1.equals(circle2));
    }
}

class Circle{
    double radius;

    public boolean equals(Object circle) {
        return this.radius == ((Circle)circle).radius;
    }
}//TRUE
