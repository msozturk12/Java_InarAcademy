package chapters.chapter09.Listing09;

public class CircleTest {
    public static void main(String[] args) {

        Circle circle1 = new Circle();

        System.out.println("The area of circle of the radius " + circle1.radius + " is " + circle1.getArea());
        System.out.println("The perimeter of circle of the radius "+ circle1.radius + " is " + circle1.getPerimeter());
        System.out.println("-----------------------------------");

        Circle circle2 = new Circle(25);
        System.out.println("The area of circle2 of the radius " + circle2.radius + " is " + circle2.getArea());
        System.out.println("-----------------------------------");
        System.out.println("Number of object after circle1 and circle2 "+Circle.getNumberOfObject());

        Circle circle3 = new Circle(125);
        System.out.println("The area of circle3 of the radius " + circle3.radius + " is " + circle2.getArea());
        System.out.println("-----------------------------------");
        circle2.setRadius(100);
        System.out.println("The area of new circle2 of the radius " + circle2.radius + " is " + circle2.getArea());

        System.out.println("Number of object after circle1,circle2 and circle3 "+Circle.getNumberOfObject());
    }

}
