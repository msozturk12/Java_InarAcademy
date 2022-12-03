package chapters.chapter13.Exercises13.Exercises13_11;

public class OctagonTest {
    public static void main(String[] args)throws CloneNotSupportedException {
        Octagon octagon = new Octagon(5);
        System.out.println(octagon);

      GeometricObject13_11  octagon2 = (GeometricObject13_11) octagon.clone();

        System.out.println("Octagon is:");
        System.out.println(octagon);
        System.out.println("Cloned Octagon is : ");
        System.out.println(octagon2);

        System.out.println("octagon.compareTo((Octagon) octagon2)-->"+octagon.compareTo((Octagon) octagon2));

    }
}
