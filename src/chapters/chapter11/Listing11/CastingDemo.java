package chapters.chapter11.Listing11;

import chapters.chapter11.Listing11.GeometricObject.Circle;
import chapters.chapter11.Listing11.GeometricObject.Rectangle;

public class CastingDemo {
    public static void main(String[] args) {
        Object object1 = new Circle(1);
        Object object2 = new Rectangle(1, 1);

        displayObject(object1);
        displayObject(object2);
    }


    public static void displayObject(Object object) {
        if(object instanceof Circle){
            System.out.println("The circle area is : " + ((Circle)object).getArea());
            System.out.println("The circle perimeter is :" + ((Circle)object).getPerimeter());
        }else if(object instanceof Rectangle){
            System.out.println("Rectangle area is " + ((Rectangle)object).getArea());
        }

    }

}