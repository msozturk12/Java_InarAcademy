package chapters.chapter13.Listing13;

import java.util.Date;

public class L13_11House implements Cloneable, Comparable<L13_11House> {
    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public L13_11House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
      L13_11House houseClone = (L13_11House) super.clone();
      houseClone.whenBuilt =(Date)(whenBuilt.clone());
      return houseClone;
    }

    @Override
    public int compareTo(L13_11House o) {
        if (area > o.area) {
            return 1;
        } else if (area < o.area) {
            return -1;
        } else {
            return 0;
        }
    }



    public static void main(String[] args) throws CloneNotSupportedException {
        L13_11House house1 = new L13_11House(1, 1750.50);
        L13_11House house2 = (L13_11House) house1.clone();
        System.out.println(house2);
    }
}
