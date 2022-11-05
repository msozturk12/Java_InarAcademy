package chapters.chapter08.Exercises08;

public class Exercises08_29 {
    public static void main(String[] args) {

        int[][] list1 = Exercises08_28.getArray(3, 3, 1);
        int[][] list2 = Exercises08_28.getArray(3, 3, 2);

        Exercises08_16.printArr(list1);
        System.out.println();


        Exercises08_16.printArr(list2);
        System.out.println();

        System.out.println("The two arrays are " + (isEquals(list1, list2) ? " " : "not ") + "identical");


    }

    private static boolean isEquals(int[][] list1, int[][] list2) {
        int[] arr1 = getMatrixToArr(list1);
        int[] arr2 = getMatrixToArr(list2);
        sort(arr1);
        sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }

        }
        return true;
    }

    private static void sort(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }

    }

    private static int[] getMatrixToArr(int[][] list1) {
        int[] arr = new int[list1.length * list1[0].length];
        int counter=0;
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1[i].length; j++) {
                arr[counter] = list1[i][j];
                counter++;

            }

        }
        return arr;
    }
}
