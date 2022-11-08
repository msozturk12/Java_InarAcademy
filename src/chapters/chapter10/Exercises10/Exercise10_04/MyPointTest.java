package chapters.chapter10.Exercises10.Exercise10_04;

public class MyPointTest {
    public static void main(String[] args) {




        Mypoint myPoint1 = new Mypoint();
        Mypoint myPoint2 = new Mypoint(10,30.5);


        System.out.println(" The distance is : "+myPoint1.distance(10,30.5));


        System.out.println("The distance is " + myPoint1.distance(new Mypoint(5,12)));
    }
}
