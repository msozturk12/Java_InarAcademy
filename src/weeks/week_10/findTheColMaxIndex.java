package weeks.week_10;

public class findTheColMaxIndex {
    public static void main(String[] args) {

        int[][] arr = TwoDimensionalArrays.getRowAndColonLengthFromUsers();
        TwoDimensionalArrays.fill2DArrayWithRandomValue(arr, 0, 5);
        TwoDimensionalArrays.printArray(arr);


        int maxColonIndex = getIndexOfMaxColon(arr);
        System.out.println("Max colon index number --> " + maxColonIndex);
    }

    public static int getIndexOfMaxColon(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int maxColIndex = -1;
        for (int col = 0; col < arr[0].length; col++) {

          int sumOfColon=0;

            for (int row = 0; row < arr.length; row++) {
                sumOfColon+=arr[row][col];
            }
            if (sumOfColon > max) {
                max = sumOfColon;
                maxColIndex = col;
            }

        }
        return maxColIndex;
    }




}
