package chapters.chapter07.Exercise07;

public class Exercises07_32 {

    /*
    -take numbers from users

     */
    public static void main(String[] args) {
        System.out.println("Enter list :");
        int[] list1 = Exercises07_26.getValueFromUsers();
        int partition = partition(list1);
        System.out.println("pivot index is --> " + partition);

    }
    //{5, 2, 9, 3, 6, 8}.--->{3, 2, 5, 9, 6, 8}.

    public static int partition(int[] list) {
        int [] result = new int[list.length];
        int pivot = list[0];
        int low = 0; //lowIndex
        int high = list.length - 1; //highIndex
                                                        //{5, 2, 9, 3, 6, 8}.--->{3, 2, 5, 9, 6, 8}.
        for (int i = 1; i <list.length ; i++) {
            if(pivot>list[i]){
                result[low]=list[i];
                low++;
            }else{
                result[high]=list[i];
                high--;
            }

        }
        result[low]=pivot;
        display(result);

        return low; //indexOfPivot
    }

    public static void display(int[] list) {
        System.out.println("After partition,the list is: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
