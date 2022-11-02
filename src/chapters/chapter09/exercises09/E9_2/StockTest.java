package chapters.chapter09.exercises09.E9_2;

import chapters.chapter09.exercises09.E9_2.Stock;

public class StockTest {
    public static void main(String[] args) {

        Stock s = new Stock("ORCL","Oracle Corporation" );

        s.setPreviousClosingPrice(34.5);
        s.setCurrentPrice(34.35);

        System.out.printf("Price-change percentage is : %.3f ", s.getChangePercent());
    }
}
