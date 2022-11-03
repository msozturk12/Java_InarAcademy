package chapters.chapter09.exercises09.Exercises09_09;

public class RegularPolygonTest {
    public static void main(String[] args) {
        RegularPolygon r = new RegularPolygon();
        r.getPerimeter();
        r.getArea();
        System.out.println("For no-arg constructor:");
        r.display();

        System.out.println("\n------------------------------");

        RegularPolygon r2 = new RegularPolygon(6,4);
        r2.getPerimeter();
        r2.getArea();
        System.out.println("For n=6 and side=4 ");
        r2.display();

        System.out.println("\n---------------------------------");

        RegularPolygon r3 = new RegularPolygon(10,4,5.6,7.8);
        r3.getPerimeter();
        r3.getArea();
        System.out.println("For n=10  side=4  x=5.5  y=7.8 ");
        r3.display();


    }
}
