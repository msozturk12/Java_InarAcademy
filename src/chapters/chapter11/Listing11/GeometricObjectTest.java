package chapters.chapter11.Listing11.OverRiding;

public class GeometricObjectTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println("A circle "+c1.toString());
        System.out.println("The color is  "+c1.getColor());
        System.out.println("The radius is  "+c1.getRadius());
        System.out.println("The area is  "+c1.getArea());
        System.out.println("The perimeter is  "+c1.getPerimeter());
        System.out.println("-------------------------------------------------");
        Rectangle r = new Rectangle(6,4);
        System.out.println("\nA rectangle --> "+r.toString());
        System.out.println("The area is " + r.getArea());
        System.out.println("The perimeter is " + r.getPerimeter());
        System.out.println("--------------------------------------------");
        Circle c2 = new Circle(2);
        System.out.println(c2.toString());
        System.out.println("--------------------------------------------");
        c2.printCircle();


    }

}
