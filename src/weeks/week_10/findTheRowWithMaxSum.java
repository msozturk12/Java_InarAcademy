package weeks.week_10;

public class findTheRowWithMaxSum {
    public static void main(String[] args) {

        int[][] arr = TwoDimensionalArrays.getRowAndColonLengthFromUsers();
        TwoDimensionalArrays.fill2DArrayWithRandomValue(arr, 0, 5);
        TwoDimensionalArrays.printArray(arr);

        int maxRowIndex = findTheRowMaxSumIndex(arr);
        System.out.println("The row with the max sum's index is --> " + maxRowIndex);

    }

    public static int findTheRowMaxSumIndex(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            int sumOfRow = getSumOfRow(arr[i]);
            if (sumOfRow > max) {
                max = sumOfRow;
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static int getSumOfRow(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

}
