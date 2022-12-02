package chapters.chapter13.Listing13.L13_01GeoObject;

public class GeometricObjectTest {
    public static void main(String[] args) {
        GeometricObject o1 =new  Circle(5);
        GeometricObject o2 =new Rectangle(5,4);

        System.out.println("the two object have the same area?" + equalsArea(o1, o2));
        System.out.println(o1);
        System.out.println("-----------------------");
        System.out.println(o2);

        System.out.println("----------------------");

        System.out.print("Circle1 :");displayGeoObj(o1);
        System.out.println();
        System.out.print("Rectangle1 :");displayGeoObj(o2);
    }

    private static Object equalsArea(GeometricObject o1, GeometricObject o2) {
        return o1.getArea()==o2.getArea();
    }
    public static void displayGeoObj(GeometricObject o){
        System.out.println();
        System.out.println("the area is " + o.getArea());
        System.out.println("the perimeter is " + o.getPerimeter());
    }
}
