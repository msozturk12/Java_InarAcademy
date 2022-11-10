package chapters.chapter10.Exercises10.Exercise10_11;

public class Circle2DTest {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.printf("The area-->%.2f\nThe perimeter is-->%.2f  ", c1.getArea(), c1.getPerimeter());
        System.out.println();

        System.out.println("c1.contains(3, 3)--> " + c1.contains(3, 3));
        System.out.println("c1.contains(new Circle2D(4, 5, 10.5))-->"+c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("c1.overlaps(new Circle2D(3, 5, 2.3))-->" + c1.overlaps(new Circle2D(3, 5, 2.3)));


    }
}
