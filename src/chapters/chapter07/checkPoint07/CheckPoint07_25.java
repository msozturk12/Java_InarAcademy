package chapters.chapter07.checkPoint07;

import chapters.chapter07.Listing07.SelectionSort;

import java.util.Arrays;

public class CheckPoint07_25 {

    public static void main(String[] args) {
        double[] list = {3.4, 5, 3, 3.5, 2.2, 1.9, 2};
        SelectionSort.selectionSort(list);
        System.out.println(Arrays.toString(list));

        //let make it decreasing order
        // reverse yaparsam olur or min bulmak yerine max dan gidilebilir
       reverse(list);


    }

    private static void reverse(double[] list) {

        for (int i = list.length-1; i >=0 ; i--) {
            System.out.print(list[i] + " ");

        }
    }
}
