package chapters.chapter13.Exercises13.Exercises13_10;

public class Rectangle13_10Test {
    public static void main(String[] args) {
        GeometricObject13_10 rectangle1 = new Rectangle13_10(8,9);
        Rectangle13_10 rectangle2 = new Rectangle13_10(8,9);
        Rectangle13_10 rectangle3 = new Rectangle13_10(4,10);

        System.out.println("R1-->" +rectangle1.toString());
        System.out.println("R2-->" +rectangle2.toString());
        System.out.println("R3-->" +rectangle3.toString());
        System.out.println("----------------------------------------------");
        System.out.println("Rectangle1's area is " + (rectangle1.equals(rectangle2)? "": "not") + " equals to Rectangle2's area");
        System.out.println("Rectangle2's area is " + (rectangle2.equals(rectangle3)? "": "not") + " equals to Rectangle3's area");

    }
}
