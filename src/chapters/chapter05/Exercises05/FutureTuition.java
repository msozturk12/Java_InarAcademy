package chapters.chapter05.Exercises05;

public class FutureTuition {

    public static void main(String[] args) {


        /**
         * tuition for this year 10_000
         * every year tuition increases %7
         * in how many year will the tuition doubled?
         * while(10_000*2)
         * tuition = tuition * 0.07;
         * year++;
         *
         */
        double tuition = 10_000;
        int year=0;
        while(tuition < 20_000){

            tuition= tuition * 1.07;
            year++;
        }
        System.out.printf("Tuition will be doubled in %d years" , year);
        System.out.printf("\nTuition will be $%.2f in %d years" , tuition,year);

    }
}
