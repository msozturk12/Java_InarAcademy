package chapters.chapter07.Exercise07;

import java.util.Arrays;

public class Exercises07_27 {

    public static void main(String[] args) {
        /*
        (Identical arrays)
        -two list if they have same content
        -get two list
        -display whether ıdentical or not
        -önemli olan iki listeyi sıralamak sonra eşit mi diye bakmak
         */
        System.out.println("Enter your list1 (first number is your size)");
        int[] list1 = Exercises07_26.getValueFromUsers();
        System.out.println("Enter your list2 (first number is your size)");
        int[] list2 = Exercises07_26.getValueFromUsers();

        System.out.println(isEquals(list1, list2) ? "Two list are identical " : " Two lists are not identical");


    }

    // 5 5 2 6 1 6  sorted -->1 2 5 5 6 6
    // 5 2 5 6 6 1  sorted -->1 2 5 5 6 6
    public static boolean isEquals(int[] list1, int[] list2) {
        sortTheList(list1);
        sortTheList(list2);

        for (int i = 0, j = 0; i < list1.length && j < list2.length; i++, j++) {
            if (list1[i] != list2[j]) {
                return false;
            }
        }
        return true;
    }

    public static void sortTheList(int[] list1) {  //5 5 2 6 1 6
        for (int i = 0; i < list1.length - 1; i++) {
            for (int j = i + 1; j < list1.length; j++) {
                if (list1[i] > list1[j]) {
                    int temp = list1[i];
                    list1[i] = list1[j];
                    list1[j] = temp;


                }

            }

        }

    }


}

