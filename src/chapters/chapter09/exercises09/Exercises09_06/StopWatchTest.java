package chapters.chapter09.exercises09.Exercises09_06;

public class StopWatchTest {
    public static void main(String[] args) {

        int[] arr = createArray();

        StopWatch s = new StopWatch();
        s.start();
        selectionSort(arr);
        s.stop();
        System.out.println("Selection sort takes " + s.getElapsedTime() + " millisecond");

    }

    private static int[] createArray() {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);

        }
        return arr;
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }
    }

    public static void fillArrWithRandomNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);

        }
    }
}
