package chapters.chapter06.CheckPoint06;

public class CheckPoint06_09 {
    /*
        public class Test {
            public static method1(int n, m) {
                n += m;
                method2(3.4);
            }

            public static int method2(int n) {
                if (n > 0) return 1;
                else if (n == 0) return 0;
                else if (n < 0) return –1;
            }
        }
    */

        public static int method1(int n, int m) {
            n += m;
            method2(3.4);
            return n;
        }

        public static double method2(double n) {
            if (n > 0) {
                return 1;
            } else if (n == 0) {
                return 0;
            } else {
                return -1;
            }
        }

    }



