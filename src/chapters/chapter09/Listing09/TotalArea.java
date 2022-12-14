package chapters.chapter09.Listing09;

public class TotalArea {
    public static void main(String[] args) {
        CircleWithPrivateDataField[] circleArray;
        circleArray = createCircleArray();
        printCircleArray(circleArray);


    }

    public static CircleWithPrivateDataField[] createCircleArray() {
        CircleWithPrivateDataField[] circleArray = new CircleWithPrivateDataField[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new CircleWithPrivateDataField(Math.random() * 100);


        }
        return circleArray;
    }

    public static void printCircleArray(CircleWithPrivateDataField[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());

        }
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("The total area of circles is %-15f\n", sum(circleArray));


    }

    public static double sum(CircleWithPrivateDataField[] circleArray) {
        double sum = 0;
        for (int i = 0; i < circleArray.length; i++) {
            sum += circleArray[i].getArea();

        }
        return sum;
    }


}
