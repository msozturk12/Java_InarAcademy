package chapters.chapter13.Exercises13.Exercises13_12;


public class E13_12 {
    public static void main(String[] args) {

        GeometricObject13_12[] geoObj = {new Circle13_12(5), new Circle13_12(2.5)
                , new Rectangle13_12(7, 5), new Rectangle13_12(9, 11)};


        System.out.println("Sum of all areas is--> " + getSumArea(geoObj));


    }

    private static double getSumArea(GeometricObject13_12[] geoObj) {
        double areaSum = 0;
        for (int i = 0; i < geoObj.length; i++) {
            areaSum += geoObj[i].getArea();
            System.out.println((i+1)+ ".area is " + geoObj[i].getArea());

        }
        return areaSum;
    }
}
