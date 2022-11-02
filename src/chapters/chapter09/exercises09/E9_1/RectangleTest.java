package chapters.chapter09.exercises09.E9_1;

import chapters.chapter09.exercises09.E9_1.Rectangle;

public class RectangleTest {

    public static void main(String[] args) {
        System.out.println("---Rectangle-1---");
        Rectangle rectangle1 = new Rectangle(4, 40);
        rectangle1.print();

        System.out.println("\n---Rectangle-2---");
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        rectangle2.print();
    }
}
