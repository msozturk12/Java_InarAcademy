package chapters.chapter10.Exercises10.Exercise10_13;

public class MyRectangle2DTest {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2,2,5.5,4.9);
        System.out.printf("Area of r1 -->%.2f \n",r1.getArea());
        System.out.println("Perimeter of r1 --> " + r1.getPerimeter());
        System.out.println("r1.contains(3,3)--> " + r1.contains(3,3));
        System.out.println("r1.contains(new MyRectangle2D(4,5,10.5,3.2)-->" + r1.contains(new MyRectangle2D(4,5,10.5,3.2)));
        System.out.println("r1.overlaps(new MyRectangle2D(3,5,2.3,5.4))--> " + r1.overlaps(new MyRectangle2D(3,5,2.3,5.4)));


    }

}
