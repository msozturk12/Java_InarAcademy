package chapters.chapter05.Exercises05;

public class StudyForPatterns {
    public static void main(String[] args) {
        PatternA();
        Breakline();
        PatternB();
        Breakline();
        PatternC();
        Breakline();
        PatternD();
        Breakline();
        Question5_17();
        Breakline();
        ExampleBaklavaDilim();

    }

    public static void Breakline() {
        System.out.println("---------------------------------------------------------------");
    }

    public static void PatternA() {
        System.out.println("Pattern A");

        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void PatternB() {

        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void PatternC() {
        for (int i = 1; i < 7; i++) {
            for (int s = 1; s < 7 - i; s++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void PatternD() {
        for (int i = 1; i < 7; i++) {
            for (int s = 1; s < i; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void Question5_17() {
        for (int i = 1; i < 8; i++) {
            for (int s = 1; s < 8 - i; s++) {
                System.out.print("    ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + "   ");
            }
            for (int m = 2; m < i + 1; m++) {
                System.out.print(m + "   ");

            }
            System.out.println();

        }

    }

    public static void ExampleBaklavaDilim() {
        for (int i = 1; i < 8; i++) {
            for (int s = 1; s < 8 - i; s++) {
                System.out.print("    ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + "   ");
            }
            for (int m = 2; m < i + 1; m++) {
                System.out.print(m + "   ");

            }
            System.out.println();
        }
        for (int i = 1; i < 7; i++) {
            for (int s = 1; s <= i; s++) {
                System.out.print("    ");
            }
            for (int j = 7 - i; j > 0; j--) {
                System.out.print(j + "   ");

            }
            for (int m = 2; m <= 7 - i; m++) {
                System.out.print(m + "   ");
            }
            System.out.println();
        }
    }
}


