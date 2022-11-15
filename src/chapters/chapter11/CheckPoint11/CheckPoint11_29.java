package chapters.chapter11.CheckPoint11;


public class CheckPoint11_29 {

    public static void main(String[] args) {
        Object circle1 = new Circle1();
        Object circle2 = new Circle1();
        System.out.println(circle1.equals(circle2));
    }
}


class Circle1 {
    double radius;

    public boolean equals(Circle circle) {
        return this.radius == circle.radius;
    }
} //FALSE

