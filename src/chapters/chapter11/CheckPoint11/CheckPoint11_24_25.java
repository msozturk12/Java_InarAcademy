package chapters.chapter11.CheckPoint11;

public class CheckPoint11_24_25 {
//24
    /*
    cast an instance of a subclass to a superclass -->true ex.apple to fruit int to double
    cast an instance of a superclass to a subclass -->false ex.fruit to apple
     */

    /*
For the GeometricObject and Circle classes in Listings 11.1 and 11.2, answer the following questions:
a. Assume that circle and object are created as follows:
Circle circle = new Circle(1);
GeometricObject object = new GeometricObject();

Are the following Boolean expressions true or false?
(circle instanceof GeometricObject)  -True
(object instanceof GeometricObject)  -True
(circle instanceof Circle)           -True
(object instanceof Circle)           -False

b. Can the following statements be compiled?
Circle circle = new Circle(5);
GeometricObject object = circle;   -->it can compile subclass-->superclass


c. Can the following statements be compiled?
GeometricObject object = new GeometricObject();
Circle circle = (Circle)object;              -->it can compile but gives ClassCastingException(Runtime Exception)
                                             -->superclass to subclass cant casting
     */

}
