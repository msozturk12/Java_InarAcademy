package chapters.chapter11.Exercises11.Exercise11_06;

import chapters.chapter10.Listing10.Loan;
import chapters.chapter11.Listing11.GeometricObject.Circle;

import java.util.ArrayList;
import java.util.Date;

public class Exercise11_06 {

    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(new Loan());
        arrayList.add(new Date());
        arrayList.add("Add String");
        arrayList.add(new Circle(10));

        for (int i = 0; i < arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
            System.out.println("**************************");

        }

        /*
        for each version
        for(Object ob : arrayList){
            System.out.println(ob);
            System.out.println("*******************");
        }
        */

    }



}
