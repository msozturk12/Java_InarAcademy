package chapters.chapter13.Exercises13.Exercises13_07;


import chapters.chapter13.Exercises13.Exercises13_05.Circle1;
import chapters.chapter13.Exercises13.Exercises13_05.GeometricObject;
import chapters.chapter13.Exercises13.Exercises13_05.Rectangle1;

public class SquareTest {
    public static void main(String[] args) {
        GeometricObject[] arr = {new Rectangle1(5.2, 2), new Circle1(5), new Square(5),
                new Square(10), new Circle1(4.5)};

        for (int i = 0; i < arr.length; i++) {

            System.out.println("Area of Geometric Object " + i + " is:  " + arr[i].getArea());
            if (arr[i] instanceof Colorable) {
                ((Colorable) arr[i]).howToColor();
            }
            System.out.println("**********************************************************");
        }


    }
}
