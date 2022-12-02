package chapters.chapter13.Exercises13.Exercises13_06;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(5);
        ComparableCircle c2 = new ComparableCircle(10);
        ComparableCircle c3 = new ComparableCircle(5);

        System.out.println("c1.compareTo(c2)--> "+c1.compareTo(c2));
        System.out.println("c2.compareTo(c1)--> "+c2.compareTo(c1));
        System.out.println("c1.compareTo(c3)--> "+c1.compareTo(c3));

    }
}
