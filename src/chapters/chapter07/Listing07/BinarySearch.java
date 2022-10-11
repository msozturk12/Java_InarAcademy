package chapters.chapter07.Listing07;

public class BinarySearch {

    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int i = binarySearch(list,0); // Returns -1
        int j = binarySearch(list, 11); // Returns 4
        int k = binarySearch(list, 12); // Returns –6
        int l = binarySearch(list, 10); // Returns –1
        int m = binarySearch(list, 3); // Returns –2
        System.out.println(i);
        System.out.println(l);
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (high + low) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}

