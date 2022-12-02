package chapters.chapter13.Exercises13.Exercises13_05;

public class GeometricObjectTest {
    public static void main(String[] args) {
        GeometricObject c1 = new Circle1("black", true, 20);
        GeometricObject c2 = new Circle1("green", false, 10);

        System.out.println("The largest Circle is-->"+Circle1.max(c1, c2));
        System.out.println("--------------------------------------------------------");
        GeometricObject r1 = new Rectangle1(4, 8);
        GeometricObject r2 = new Rectangle1(9, 8);

        System.out.println("The largest Rectangle is-->"+Rectangle1.max(r1, r2));
    }
}
