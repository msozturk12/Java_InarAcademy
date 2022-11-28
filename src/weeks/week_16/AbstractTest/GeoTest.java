package weeks.week_16.AbstractTest;

public class GeoTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 5);
        Circle c = new Circle(5);
        Square s = new Square(5);
        GeoObject geo = new Circle(5);

        System.out.println("Area of r -->" + r.getArea());
        System.out.println("Area of c -->" + c.getArea());
        System.out.println("Area of geo -->" + geo.getArea());
        System.out.println(hasEqualArea(s,r));
        System.out.println(hasEqualArea(geo,c));


    }

    public static boolean hasEqualArea(GeoObject o1, GeoObject o2) {
        return o1.getArea() == o2.getArea();
    }
}
