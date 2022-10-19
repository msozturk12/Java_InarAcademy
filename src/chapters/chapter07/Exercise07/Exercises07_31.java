package chapters.chapter07.Exercise07;

public class Exercises07_31 {
    public static void main(String[] args) {

        System.out.println("Enter your list1 (first number is your size)");
        int[] list1 = Exercises07_26.getValueFromUsers();
        System.out.println("Enter your list2 (first number is your size)");
        int[] list2 = Exercises07_26.getValueFromUsers();

        int[] list3 = merged(list1, list2);
        sort(list3);

        System.out.print("The merged list is --> ");
        displayMerged(list3);
    }


    public static int[] merged(int[] list1, int[] list2) {
        int[] merged = new int[list1.length + list2.length];

        for (int i = 0; i < list1.length; i++) {
            merged[i] = list1[i];

        }
        for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
            merged[j] = list2[i];  //içinde list1 var ondan sonrasına ekliyoruz

        }
        return merged;
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                swap(arr, i, j);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        if (arr[i] > arr[j]) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void displayMerged(int[] list3) {
        for (int num : list3) {
            System.out.print( num + " ");

        }
    }
}
