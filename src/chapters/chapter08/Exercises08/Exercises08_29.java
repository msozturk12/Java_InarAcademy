package chapters.chapter08.Exercises08;

public class Exercises08_29 {
    public static void main(String[] args) {
        final int ROW = 3;
        final int COL = 3;

        int[][] list1 = Exercises08_28.getArray(ROW, COL, 1);
        int[][] list2 = Exercises08_28.getArray(ROW, COL, 2);
        sort(list1);
        Exercises08_16.printArr(list1);
        System.out.println();
        sort(list2);
        Exercises08_16.printArr(list2);
        System.out.println();

         System.out.println("The two arrays are " + (isEquals(list1, list2) ? "" : "not") + " identical");
    }

    public static boolean isEquals(int[][] list1, int[][] list2) {
        sort(list1);
        sort(list2);
        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1[i].length; j++) {
                if (list1[i][j] != list2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] sort(int[][] arr) {
        int[] list = getMatrixToArr(arr);
        for (int i = 0; i < arr.length; i++) {
            int min = list[i];
            int minIndex = i;
            for (int j = i + 1; j < arr[i].length; j++) {
                if (min > list[j]) {
                    min = list[j];
                    minIndex = j;

                }
            }
            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
        return list;
    }

    public static int[] getMatrixToArr(int[][] arr) {
        int[] matrixToArr = new int[arr.length * arr[0].length];//for all elements of arr 3*3
        int z = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                matrixToArr[z] = arr[i][j];
                z++;

            }

        }
        return matrixToArr;
    }

}

