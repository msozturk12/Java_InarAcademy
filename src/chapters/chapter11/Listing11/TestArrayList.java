package chapters.chapter11.Listing11;

import chapters.chapter11.Listing11.GeometricObject.Circle;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("London");
        cityList.add("Isparta");
        cityList.add("Istanbul");
        cityList.add("Texas");
        cityList.add("Paris");
        cityList.add("Amsterdam");

        System.out.println("List size is " + cityList.size());
        System.out.println("is paris in the list?-->" + cityList.contains("Paris"));
        System.out.println("the location of Isparta in the list-->" + cityList.indexOf("Isparta"));
        System.out.println("is the list empty? " + cityList.isEmpty());
        cityList.add(3, "Tokyo");
        cityList.remove("London");
        System.out.println(cityList.toString());
        cityList.remove(5);
        System.out.println(cityList.toString());


        for (int i = cityList.size() - 1; i >= 0; i--) {
            System.out.print(cityList.get(i) + " ");

        }

        System.out.println();
        ArrayList<Circle> list = new ArrayList<>();

        list.add(new Circle(2));
        list.add(new Circle(3));

        System.out.println("list.get(0).getArea()-->"+list.get(0).getArea());
        System.out.println("list.get(1).getPerimeter-->"+list.get(1).getPerimeter());

    }
}
