package chapters.chapter13.Listing13;

import chapters.chapter13.Listing13.L13_01GeoObject.Rectangle;

public class L13_09ComparableRectangle extends Rectangle implements Comparable<L13_09ComparableRectangle> {
    public L13_09ComparableRectangle(double width, double height) {
        super(width, height);

    }


    @Override
    public int compareTo(L13_09ComparableRectangle o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Area: " + getArea();
    }
}
