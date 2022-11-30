package chapters.chapter13.Listing13;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClonableTest {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2022, 11, 30);
        Calendar calendar1 = calendar;
        Calendar calendar2 = (Calendar) calendar.clone();
        System.out.println("calendar== calendar1 is " + (calendar == calendar1));//true
        System.out.println("calendar== calendar2 is " + (calendar == calendar2));//false
        System.out.println("calendar.equals(calendar2) is " + (calendar.equals(calendar2)));//true
        System.out.println("------------------------------------------");

        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(1.5);
        list1.add(2.5);
        list1.add(3.5);
        ArrayList<Double> list2 = (ArrayList<Double>) list1.clone();
        ArrayList<Double> list3 = list1;
        list2.add(4.5);
        list3.remove(1.5);
        System.out.println("list1 is " + list1);//1.5 , 2.5 , 3.5
        System.out.println("list2 is " + list2);//1.5 , 2.5 , 3.5 , 4.5
        System.out.println("list3 is " + list3);//2.5 , 3.5

        System.out.println("--------------------------------------------");

        int[] listA = {1,2};
        int[] listB = listA.clone();
        listA[0]=7;
        listB[1]=8;
        System.out.println("listA is "+ listA[0] + " , " + listA[1]); //7,2
        System.out.println("listB is "+ listB[0] + " , " + listB[1]);//1,8


    }
}
