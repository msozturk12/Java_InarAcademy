package chapters.chapter06.Listing06;

public class TestVoidMethod {
    public static void main(String[] args) {

        printGrade(109.0);
        printGrade(55.5);
        metod(0);
    }


    static void metod(int derinliksayacı) {
        if(derinliksayacı==1000){
            return;
        }
        derinliksayacı++;
        System.out.println((derinliksayacı));
        metod(derinliksayacı);
    }

    public static void printGrade(double score) {

        if (score > 100) {
            return;
        }
        System.out.println("The grade is : " + getGrade(score));
    }

    public static char getGrade(double score) {
        if (score >= 90.0) {
            return 'A';
        } else if (score >= 80.0) {
            return 'B';
        } else if (score >= 70.0) {
            return 'C';
        } else if (score >= 60.0) {
            return 'D';
        } else {
            return 'F';
        }
    }

}
