package chapters.chapter07.Listing07;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        double[] list = new double[3];
        list[0] = 12.3;
        list[1] = 2.3;
        list[2] = 5.3;


        selectionSort(list);
        System.out.println("list " + Arrays.toString(list));



    }


    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }

            }
            if (currentMin != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

}
