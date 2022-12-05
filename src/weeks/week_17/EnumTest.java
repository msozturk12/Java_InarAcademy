package weeks.week_17;

public class EnumTest {
    public static void main(String[] args) {
        printColor(Color.RED);
        printColor(Color.BLUE);
        printColor(Color.GREEN);
        //printColor(Color.Yellow); it is not possible,because in enum, it doesnt have
    }

    public static void printColor(Color color) {
        System.out.println(color);
    }
}

