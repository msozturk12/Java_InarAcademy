package chapters.chapter12.CheckPoints12;

import chapters.chapter05.Exercises05.Ex;
import chapters.chapter11.Listing11.GeometricObject.Circle;

public class Checkpoints12_25_26 {
    /*
    Checkpoints12_25-->To define a custom class, extend Exception or a subclass of Exception

     */

    /*
Suppose the setRadius method throws the InValidRadiusException defined in
Listing 12.10. What is displayed when the following program is run?

*InvalidRadiusException extends from Exception*

    public static void main(String[] args) {
        try {
            method();
            System.out.println("After the method call");

        } catch (RuntimeException ex) {
            System.out.println("Run time ex in main");

        } catch (Exception ex) {
            System.out.println("Exception in main");
        }
    }

    public static void method() throws Exception {
        try {
            Circle c1 = new Circle(1);
            c1.setRadius(-1);
            System.out.println(c1.getRadius());
        } catch (RuntimeException ex) {
            System.out.println("Runtime ex in method()");
        } catch (Exception ex) {
            System.out.println("Exception in method()");
            throw ex;
        }
    }
}
  */

/*
output--> -Exception in method()
          -Exception in main
 */
}