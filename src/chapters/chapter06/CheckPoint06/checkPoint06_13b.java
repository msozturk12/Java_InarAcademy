package chapters.chapter06.CheckPoint06;

public class checkPoint06_13b {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 6) {
            method1(i, 2);
            i++;
        }
    }
    public static void method1(int i, int num) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num *= 2;
        }
        System.out.println();
    }
/*
2
2 4
2 4 8
2 4 8 16
2 4 8 16 32
2 4 8 16 32 64
 */
}


