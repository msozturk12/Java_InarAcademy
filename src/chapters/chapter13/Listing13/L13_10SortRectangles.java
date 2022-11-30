package chapters.chapter13.Listing13;

import chapters.chapter13.Listing13.L13_09ComparableRectangle;

import java.util.Arrays;

public class L13_10SortRectangles {
    public static void main(String[] args) {
        L13_09ComparableRectangle[] rectangles = {new L13_09ComparableRectangle(12,5),
                new L13_09ComparableRectangle(10,13.5),
                new L13_09ComparableRectangle(5,5),
                new L13_09ComparableRectangle(4,15)};
        Arrays.sort(rectangles);
        for(L13_09ComparableRectangle r : rectangles){
            System.out.println(r);

        }

    }

}
