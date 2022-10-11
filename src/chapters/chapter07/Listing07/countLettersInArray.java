package chapters.chapter07.Listing07;

public class countLettersInArray {
    public static void main(String[] args) {

        char[] str = getRandomStr();
        printCharArray(str);

        int [] counter = getCounter(str);
        printCounter(counter);
    }

    public static void printCounter(int[] counter) {

        for (int i = 0; i <counter.length ; i++) {
            System.out.print( (char)('a' + i)  + ":" + counter[i] + " " );
            if((i+1)% 10 ==0){
                System.out.println();
            }
        }
    }

    public static int[] getCounter(char[] str) {

        int [] count = new int[26];

        for (int i = 0; i < str.length; i++) {
            count[str[i] - 'a']++;
        }
        return count;
    }

    private static void printCharArray(char[] str) {
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }

    public static char[] getRandomStr() {

        char[] arr = new char[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getaChar();
        }
        return arr;
    }

    private static char getaChar() {
        return (char) (int) ('a' + (Math.random() * 26));
    }
}
