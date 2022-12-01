package chapters.chapter13.Checkpoints13;

import chapters.chapter13.Listing13.L13_01GeoObject.Circle;
import chapters.chapter13.Listing13.L13_01GeoObject.GeometricObject;

import java.util.Date;

public class CheckPoints13_22_23_24_25_26 {


    /*
    CheckPoints13_22-->
            Can you invoke the clone() method to clone an object if the class for the object
            does not implement the java.lang.Cloneable? -->no
            Does the Date class implement Cloneable? -->yes,it does.

    CheckPoints13_23-->
            What would happen if the House class (defined in Listing 13.11) did not override the
            clone() method or if House did not implement java.lang.Cloneable?-->not able to use  clone()

    CheckPoints13_24-->
            java.util.Date date = new java.util.Date();
            java.util.Date date1 = date;
            java.util.Date date2 = (java.util.Date)(date.clone());
            System.out.println(date == date1);   -->true
            System.out.println(date == date2);   -->false
            System.out.println(date.equals(date2));-->true

     CheckPoints13_25-->
            ArrayList<String> list = new ArrayList<>();
            list.add("New York");
            ArrayList<String> list1 = list;
            ArrayList<String> list2 = (ArrayList<String>)(list.clone());
            list.add("Atlanta");
            System.out.println(list == list1);                    -->true
            System.out.println(list == list2);                    -->false
            System.out.println("list is " + list);                -->new York,Atlanta
            System.out.println("list1 is " + list1);              -->New York,Atlanta
            System.out.println("list2.get(0) is " + list2.get(0));-->New York
            System.out.println("list2.size() is " + list2.size());-->1

      CheckPoints13_26-->
         public class Test {
                public static void main(String[] args) {
                     GeometricObject x = new Circle(3);
                     GeometricObject y = x.clone();
                     System.out.println(x == y);
                }
        }
--> a compile error is reported because clone() is protected in Object.
    To enable cloning, do two things: (1) override clone() in the class for the object to be cloned;
    (2) implement java.lang.Cloneable for the class.
     */
}
