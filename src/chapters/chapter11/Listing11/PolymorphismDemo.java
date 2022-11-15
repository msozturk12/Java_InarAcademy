package chapters.chapter11.Listing11;

import chapters.chapter11.Listing11.GeometricObject.Circle;
import chapters.chapter11.Listing11.GeometricObject.GeometricObject;
import chapters.chapter11.Listing11.GeometricObject.Rectangle;

public class PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new Circle("blue", true, 5));
        displayObject(new Rectangle("white",false,2,2));

    }

    public static void displayObject(GeometricObject go) {
        System.out.println("Created on " + go.getDateCreated() +
                " color: " + go.getColor() + " is filled " + go.isFilled());
    }

}
