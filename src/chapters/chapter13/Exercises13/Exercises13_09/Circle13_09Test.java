package chapters.chapter13.Exercises13.Exercises13_09;

public class Circle13_09Test {
    public static void main(String[] args) {
        GeometricObject13_09 circle1 = new Circle13_09(5);
        GeometricObject13_09 circle2 = new Circle13_09(5);
        GeometricObject13_09 circle3 = new Circle13_09(2.3);

        System.out.println("Circle1 is" +( circle1.equals(circle2) ? " " : " not ") + "equals to Circle2");
        System.out.println("Circle2 is" +( circle2.equals(circle3) ? " " : " not ") + "equals to Circle3");
    }
}
